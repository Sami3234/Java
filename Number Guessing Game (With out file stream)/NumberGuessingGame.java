import java.util.*;

// =============== VARIABLES ===============
public class NumberGuessingGame {
    static Scanner input = new Scanner(System.in);
    static Map<String, String[]> userMap = new HashMap<>(); // username -> [password, firstName, lastName]
    static boolean isFirstGame = true, isLoggedIn = false, guestPlayed = false;
    static String currentUsername = "";

    // =============== MAIN METHOD ===============
    public static void main(String[] args) {
        while (true) {
            if (isFirstGame) {
                System.out.println("\n=== Welcome to Number Guessing Game ===");
                System.out.println("1. Create Account\n2. Play as Guest");
                System.out.print("Enter your choice (1 or 2): ");
                String choice = input.nextLine().trim();

                if (choice.equals("1")) {
                    createAccount();
                } else if (choice.equals("2") && !guestPlayed) {
                    System.out.println("\nStarting Game in Guest Mode...");
                    showInstructions();
                    playGame();
                    guestPlayed = true;
                    System.out.println("\nGuest session ended. You must create an account to continue.\n");
                    createAccount();
                } else {
                    System.out.println(guestPlayed ? "\nGuest mode already used. Please create an account.\n"
                            : "Invalid choice. Please select 1 or 2.");
                    if (guestPlayed)
                        createAccount();
                }
            } else if (!isLoggedIn && !login()) {
                System.out.println("Login failed. Please try again.\n");
                continue;
            }

            if (isLoggedIn) {
                playGame();
                switch (askRetry()) {
                    case 1:
                        System.out.println(
                                "\nRestarting game...\nBoxes are reshuffling...\nPress Enter to Start the Game...");
                        input.nextLine();
                        continue;
                    case 2:
                        System.out.println("Game Ended.\nYour account has been deleted.\n");
                        isFirstGame = true;
                        isLoggedIn = false;
                        break;
                    case 3:
                        System.out.println("Logged out successfully.\n");
                        isLoggedIn = false;
                        break;
                }
            }
        }
    }

    // =============== ACCOUNT METHODS ===============
    private static void createAccount() {
        System.out.println("\n=== Create New Account ===");
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine().trim();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine().trim();

        String username, password;
        while (true) {
            try {
                System.out.print("Enter username (min 4 chars, must include letters and numbers): ");
                username = input.nextLine().trim();
                validateInput(username, 4, "Username");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Enter password (min 6 chars, must include letters and numbers): ");
                password = input.nextLine().trim();
                validateInput(password, 6, "Password");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        userMap.put(username, new String[] { password, firstName, lastName });
        System.out.println("Account created successfully!");
        isFirstGame = false;
        isLoggedIn = false;
        login();
    }

    private static boolean login() {
        System.out.println("\n=== Login ===");
        System.out.print("Enter username: ");
        String uname = input.nextLine().trim();

        String[] userData = userMap.get(uname);
        if (userData == null) {
            System.out.println("Invalid username!");
            return false;
        }

        for (int attempts = 0; attempts < 3; attempts++) {
            System.out.print("Enter password: ");
            if (input.nextLine().trim().equals(userData[0])) {
                System.out.println("Login successful! Welcome " + userData[1] + " " + userData[2] + "!");
                isLoggedIn = true;
                currentUsername = uname;
                showInstructions();
                return true;
            }
            System.out.println("Invalid password! Attempts left: " + (2 - attempts));
        }
        System.out.println("Too many failed attempts.");
        return false;
    }

    // =============== GAME LOGIC ===============
    static void showInstructions() {
        System.out.println("Game Instructions\n--------------------");
        System.out.println("There are 5 hidden boxes.\nEach box contains a unique number from 1 to 5.");
        System.out.println("You need to guess the correct box for each number.\nYou get 3 attempts per number.");
        System.out.println("Fail all 3 attempts? Game Over.\n");
        System.out.println("Press Enter to Start the Game...");
        input.nextLine();
    }

    static void playGame() {
        int[] boxes = generateRandomBoxes();
        boolean[] revealedBoxes = new boolean[5];

        for (int numberToFind = 1; numberToFind <= 5; numberToFind++) {
            for (int chance = 1; chance <= 3; chance++) {
                displayBoxes(revealedBoxes, boxes, numberToFind);
                System.out.print("\nEnter the box number (1-5): ");
                int guess = getValidInput(5);

                if (boxes[guess - 1] == numberToFind) {
                    System.out.println("\nCorrect! Now find the next number.");
                    revealedBoxes[guess - 1] = true;
                    break;
                }
                if (chance == 3) {
                    System.out.println("\nYou failed all attempts! Game Over.");
                    return;
                }
                System.out.println("\nIncorrect! You have " + (3 - chance) + " attempt(s) left.");
            }
        }
        System.out.println("\nCongratulations! You found all numbers!");
    }

    // =============== GAME UTILITIES ===============
    static void displayBoxes(boolean[] revealed, int[] boxes, int numberToFind) {
        System.out.println("\nNumber to find: " + numberToFind);
        for (int i = 0; i < 5; i++) {
            if (!revealed[i]) {
                System.out.println((i + 1) + ". [ Box " + (i + 1) + " ]");
            }
        }
    }

    static int getValidInput(int maxBox) {
        while (true) {
            try {
                int num = Integer.parseInt(input.nextLine());
                if (num >= 1 && num <= maxBox)
                    return num;
                System.out.print("Please enter a number between 1 and " + maxBox + ": ");
            } catch (Exception e) {
                System.out.print("Invalid input. Enter number between 1 to " + maxBox + ": ");
            }
        }
    }

    static int[] generateRandomBoxes() {
        int[] arr = { 1, 2, 3, 4, 5 };
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    static int askRetry() {
        while (true) {
            System.out.println("\nWhat would you like to do next?");
            System.out.println("1. Retry Game\n2. End Game (Delete Account)\n3. Logout");
            System.out.print("Enter choice (1, 2, or 3): ");
            String choice = input.nextLine().trim();
            if (choice.matches("[1-3]")) {
                int selectedChoice = Integer.parseInt(choice);
                if (selectedChoice == 2)
                    userMap.remove(currentUsername);
                return selectedChoice;
            }
            System.out.println("Please enter a valid option.");
        }
    }

    // =============== VALIDATION ===============
    private static void validateInput(String input, int minLength, String type) {
        if (input.length() < minLength)
            throw new IllegalArgumentException(type + " must be at least " + minLength + " characters long.");
        boolean hasLetter = false, hasDigit = false;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c))
                hasLetter = true;
            if (Character.isDigit(c))
                hasDigit = true;
        }
        if (!hasLetter || !hasDigit)
            throw new IllegalArgumentException(type + " must contain both letters and numbers.");
    }
}
