import java.util.*;
import java.io.*;
import java.nio.file.*;

public class NumberGuessingGame {
    // =============== CONSTANTS AND VARIABLES ===============
    static Scanner input = new Scanner(System.in);
    static String username = "", password = "", firstName = "", lastName = "";
    static boolean isLoggedIn = false;
    static boolean guestPlayed = false;
    static final String DATA_FILE = "Files/user_data.csv";

    // =============== MAIN METHOD ===============
    public static void main(String[] args) {
        createDataFileIfNotExists();
        while (true) {
            if (!isLoggedIn) {
                showLoginMenu();
            } else {
                playGame();
                handleGameEnd();
            }
        }
    }

    // =============== LOGIN AND ACCOUNT MANAGEMENT ===============
    private static void showLoginMenu() {
        System.out.println("\n=== Welcome to Number Guessing Game ===");
        System.out.println("1. Create Account\n2. Login\n3. Play as Guest");
        System.out.print("Enter your choice (1, 2, or 3): ");

        String choice = input.nextLine().trim();
        switch (choice) {
            case "1":
                createAccount();
                break;
            case "2":
                if (!isFileEmpty() && login()) {
                    isLoggedIn = true;
                } else {
                    System.out.println("Login failed. Please try again.\n");
                }
                break;
            case "3":
                handleGuestMode();
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
    }

    private static void handleGuestMode() {
        if (!guestPlayed) {
            System.out.println("\nStarting Game in Guest Mode...");
            showInstructions();
            playGame();
            guestPlayed = true;
            System.out.println("\nGuest session ended. You must create an account to continue.\n");
        } else {
            System.out.println("\nGuest mode already used. Please create an account.\n");
        }
    }

    private static void createAccount() {
        System.out.println("\n=== Create New Account ===");
        getPersonalInfo();
        getUsername();
        getPassword();
        saveUserData();
        System.out.println("Account created successfully!");
        isLoggedIn = true;
        showInstructions();
    }

    private static void getPersonalInfo() {
        System.out.print("Enter your first name: ");
        firstName = input.nextLine().trim();
        System.out.print("Enter your last name: ");
        lastName = input.nextLine().trim();
    }

    private static void getUsername() {
        while (true) {
            try {
                System.out.print("Enter username (min 4 chars, must include letters and numbers): ");
                username = input.nextLine().trim();
                validateUsername(username);
                if (isUsernameExists(username)) {
                    System.out.println("Username already exists. Please choose another one.");
                    continue;
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void getPassword() {
        while (true) {
            try {
                System.out.print("Enter password (min 6 chars, must include letters and numbers): ");
                password = input.nextLine().trim();
                validatePassword(password);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static boolean login() {
        System.out.println("\n=== Login ===");
        String uname = "";
        while (true) {
            System.out.print("Enter username: ");
            uname = input.nextLine().trim();
            if (isUsernameExists(uname))
                break;
            System.out.println("Username not found! Please try again.");
        }

        for (int attempts = 0; attempts < 3; attempts++) {
            System.out.print("Enter password: ");
            String pword = input.nextLine().trim();
            if (validateCredentials(uname, pword))
                return true;
            System.out.println("Invalid password! Attempts left: " + (2 - attempts));
        }
        System.out.println("Too many failed attempts.");
        return false;
    }

    // =============== FILE OPERATIONS ===============
    private static void createDataFileIfNotExists() {
        try {
            File file = new File(DATA_FILE);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
                try (PrintWriter out = new PrintWriter(new FileWriter(DATA_FILE))) {
                    out.println("Full Name,Username,Password");
                }
            }
        } catch (IOException e) {
            System.out.println("Error creating data file: " + e.getMessage());
        }
    }

    private static boolean isFileEmpty() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(DATA_FILE));
            return lines.isEmpty() || (lines.size() == 1 && lines.get(0).equals("Full Name,Username,Password"));
        } catch (IOException e) {
            return true;
        }
    }

    private static void saveUserData() {
        try (PrintWriter out = new PrintWriter(new FileWriter(DATA_FILE, true))) {
            out.println(firstName + " " + lastName + "," + username + "," + password);
        } catch (IOException e) {
            System.out.println("Error saving user data: " + e.getMessage());
        }
    }

    private static boolean isUsernameExists(String username) {
        try (BufferedReader br = new BufferedReader(new FileReader(DATA_FILE))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[1].equals(username))
                    return true;
            }
        } catch (IOException e) {
            System.out.println("Error checking username: " + e.getMessage());
        }
        return false;
    }

    private static void deleteAccount() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(DATA_FILE));
            String header = lines.get(0);
            lines.removeIf(line -> line.split(",")[1].equals(username));
            Files.write(Paths.get(DATA_FILE), lines);
        } catch (IOException e) {
            System.out.println("Error deleting account: " + e.getMessage());
        }
    }

    private static boolean validateCredentials(String uname, String pword) {
        try (BufferedReader br = new BufferedReader(new FileReader(DATA_FILE))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[1].equals(uname) && data[2].equals(pword)) {
                    username = data[1];
                    password = data[2];
                    String[] nameParts = data[0].split(" ");
                    firstName = nameParts[0];
                    lastName = nameParts.length > 1 ? nameParts[1] : "";
                    System.out.println("Login successful! Welcome " + data[0] + "!");
                    showInstructions();
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error during login: " + e.getMessage());
        }
        return false;
    }

    // =============== GAME LOGIC ===============
    private static void playGame() {
        int[] boxes = generateRandomBoxes();
        boolean[] revealedBoxes = new boolean[5];
        boolean gameOver = false;

        for (int numberToFind = 1; numberToFind <= 5; numberToFind++) {
            if (!tryToFindNumber(boxes, revealedBoxes, numberToFind)) {
                gameOver = true;
                break;
            }
        }

        if (!gameOver) {
            System.out.println("\nCongratulations! You found all numbers!");
        }
    }

    private static boolean tryToFindNumber(int[] boxes, boolean[] revealedBoxes, int numberToFind) {
        for (int chance = 1; chance <= 3; chance++) {
            displayBoxes(revealedBoxes, boxes, numberToFind);
            System.out.print("\nEnter the box number (1-5): ");
            int guess = getValidInput(5);

            if (boxes[guess - 1] == numberToFind) {
                System.out.println("\nCorrect! Now find the next number.");
                revealedBoxes[guess - 1] = true;
                return true;
            } else {
                System.out.println("\nIncorrect! You have " + (3 - chance) + " attempt(s) left.");
            }
        }
        System.out.println("\nYou failed all attempts! Game Over.");
        return false;
    }

    // =============== GAME UTILITIES ===============
    static void showInstructions() {
        System.out.println("Game Instructions");
        System.out.println("--------------------");
        System.out.println("There are 5 hidden boxes.");
        System.out.println("Each box contains a unique number from 1 to 5.");
        System.out.println("You need to guess the correct box for each number.");
        System.out.println("You get 3 attempts per number.");
        System.out.println("Fail all 3 attempts? Game Over.\n");
        System.out.println("Press Enter to Start the Game...");
        input.nextLine();
    }

    static void displayBoxes(boolean[] revealed, int[] boxes, int numberToFind) {
        System.out.println("\nNumber to find: " + numberToFind);
        for (int i = 0; i < 5; i++) {
            if (!revealed[i]) {
                System.out.println((i + 1) + ". [ Box " + (i + 1) + " ]");
            }
        }
    }

    static int getValidInput(int maxBox) {
        int num = -1;
        while (true) {
            try {
                num = Integer.parseInt(input.nextLine());
                if (num >= 1 && num <= maxBox) {
                    return num;
                } else {
                    System.out.print("Please enter a number between 1 and " + maxBox + ": ");
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Enter number between 1 to " + maxBox + ": ");
            }
        }
    }

    static int[] generateRandomBoxes() {
        int[] arr = { 1, 2, 3, 4, 5 };
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    // =============== GAME END HANDLING ===============
    private static void handleGameEnd() {
        int choice = askRetry();
        switch (choice) {
            case 1:
                System.out.println("\nRestarting game...\nBoxes are reshuffling...\nPress Enter to Start...");
                input.nextLine();
                break;
            case 2:
                System.out.println("Game Ended.\nYour account has been deleted.\n");
                deleteAccount();
                isLoggedIn = false;
                break;
            case 3:
                System.out.println("Logged out successfully.\n");
                isLoggedIn = false;
                break;
        }
    }

    static int askRetry() {
        while (true) {
            System.out.println("\nWhat would you like to do next?");
            System.out.println("1. Play Again");
            System.out.println("2. End Game (Delete Account)");
            System.out.println("3. Logout");
            System.out.print("Enter choice (1, 2, or 3): ");
            String choice = input.nextLine().trim();
            if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
                return Integer.parseInt(choice);
            } else {
                System.out.println("Please enter a valid option.");
            }
        }
    }

    // =============== VALIDATION METHODS ===============
    private static void validateUsername(String username) {
        if (username.length() < 4)
            throw new IllegalArgumentException("Username must be at least 4 characters long.");
        boolean hasLetter = false, hasDigit = false;
        for (char c : username.toCharArray()) {
            if (Character.isLetter(c))
                hasLetter = true;
            if (Character.isDigit(c))
                hasDigit = true;
        }
        if (!hasLetter || !hasDigit)
            throw new IllegalArgumentException("Username must contain both letters and numbers.");
    }

    private static void validatePassword(String password) {
        if (password.length() < 6)
            throw new IllegalArgumentException("Password must be at least 6 characters long.");
        boolean hasLetter = false, hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c))
                hasLetter = true;
            if (Character.isDigit(c))
                hasDigit = true;
        }
        if (!hasLetter || !hasDigit)
            throw new IllegalArgumentException("Password must contain both letters and numbers.");
    }
}
