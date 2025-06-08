import java.util.*;

public class NumberGuessingGame {
    static Scanner input = new Scanner(System.in);
    static String username = "", password = "", firstName = "", lastName = "";
    static boolean isFirstGame = true;
    static boolean isLoggedIn = false;
    static Map<String, String> accounts = new HashMap<>();
    static Map<String, String[]> userDetails = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            if (isFirstGame) {
                createAccount();
            } else if (!isLoggedIn) {
                if (!login()) {
                    System.out.println("Login failed. Please try again.");
                    continue;
                }
            }
            if (isLoggedIn) {
                playGame();
                int choice = askRetry();
                if (choice == 1) {
                    System.out.println("\nRestarting game...");
                    System.out.println("Boxes are reshuffling...\n");
                    System.out.println("Press Enter to Start the Game...");
                    input.nextLine();
                    continue;
                } else if (choice == 2) {
                    System.out.println("Game Ended.");
                    System.out.println("Your account has been deleted.\n");
                    System.out.println("Please create a new account to play again.");
                    isFirstGame = true;
                    isLoggedIn = false;
                } else if (choice == 3) {
                    System.out.println("Logged out successfully.\n");
                    isLoggedIn = false;
                }
            }
        }
    }

    private static boolean isValidUsername(String username) {
        if (username.length() < 4)
            return false;

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (char c : username.toCharArray()) {
            if (Character.isLetter(c))
                hasLetter = true;
            if (Character.isDigit(c))
                hasDigit = true;
            if (hasLetter && hasDigit)
                return true;
        }
        return false;
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 6)
            return false;

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c))
                hasLetter = true;
            if (Character.isDigit(c))
                hasDigit = true;
            if (hasLetter && hasDigit)
                return true;
        }
        return false;
    }

    private static void createAccount() {
        System.out.println("\n=== Create New Account ===");
        String username;
        String password;

        System.out.print("Enter your first name: ");
        firstName = input.nextLine().trim();
        System.out.print("Enter your last name: ");
        lastName = input.nextLine().trim();

        do {
            System.out.print("Enter username (must contain both letters and numbers): ");
            username = input.nextLine().trim();
            if (!isValidUsername(username)) {
                System.out.println("Username must be at least 4 characters long and contain both letters and numbers!");
            } else if (accounts.containsKey(username)) {
                System.out.println("This username is already taken. Please choose another one.");
                username = "";
            }
        } while (!isValidUsername(username) || username.isEmpty());

        do {
            System.out.print("Enter password (minimum 6 characters, must contain both letters and numbers): ");
            password = input.nextLine().trim();
            if (!isValidPassword(password)) {
                System.out.println("Password must be at least 6 characters long and contain both letters and numbers!");
            }
        } while (!isValidPassword(password));

        accounts.put(username, password);
        userDetails.put(username, new String[] { firstName, lastName });
        System.out.println("Account created successfully!");
        isFirstGame = false;
        login();
    }

    private static boolean login() {
        System.out.println("\n=== Login ===");
        System.out.print("Enter username: ");
        String username = input.nextLine().trim();

        if (!accounts.containsKey(username)) {
            System.out.println("Invalid username!");
            return false;
        }

        int maxAttempts = 3;
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("Enter password: ");
            String password = input.nextLine().trim();

            String storedPassword = accounts.get(username);
            if (storedPassword.equals(password)) {
                String[] details = userDetails.get(username);
                firstName = details[0];
                lastName = details[1];
                System.out.println("Login successful! Welcome " + firstName + " " + lastName + "!");
                isLoggedIn = true;
                showInstructions();
                return true;
            } else {
                attempts++;
                if (attempts < maxAttempts) {
                    System.out.println("Invalid password! Attempts remaining: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Too many failed attempts. Please try logging in again.");
                    return false;
                }
            }
        }
        return false;
    }

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

    static void playGame() {
        int[] boxes = generateRandomBoxes();
        boolean[] revealedBoxes = new boolean[5];
        boolean gameOver = false;

        for (int numberToFind = 1; numberToFind <= 5; numberToFind++) {
            boolean correctGuess = false;
            for (int chance = 1; chance <= 3; chance++) {
                displayBoxes(revealedBoxes, boxes, numberToFind);
                System.out.print("\nEnter the box number (1-5) : ");
                int guess = getValidInput(5);

                if (boxes[guess - 1] == numberToFind) {
                    System.out.println("\nCorrect! Now find the next number.");
                    revealedBoxes[guess - 1] = true;
                    correctGuess = true;
                    break;
                } else {
                    System.out.println("\nIncorrect! You have " + (3 - chance) + " attempt"
                            + (chance == 1 ? " left." : "s left."));
                    if (chance == 1) {
                        System.out.println("\nTry again:");
                    }
                }
            }

            if (!correctGuess) {
                System.out.println("\nYou failed both attempts!");
                System.out.println("Game Over!\n");
                gameOver = true;
                break;
            }
        }

        if (!gameOver) {
            System.out.println("\nCongratulations! You found all numbers!");
            System.out.println("You're the Box Master!\n");
        }
    }

    static void displayBoxes(boolean[] revealed, int[] boxes, int numberToFind) {
        System.out.println("\nNumber to find: " + numberToFind);
        if (numberToFind > 1) {
            System.out.println("\nRemaining boxes:\n");
        } else {
            System.out.println("\nSelect from the boxes below:\n");
        }
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

    static int askRetry() {
        while (true) {
            System.out.println("\nWhat would you like to do next?\n");
            System.out.println("1. Retry Game (same account)");
            System.out.println("2. End Game (delete account)");
            System.out.println("3. Logout (login again)\n");
            System.out.print("Enter your choice (1, 2, or 3) : ");
            String inputStr = input.nextLine().trim();
            if (inputStr.equals("1") || inputStr.equals("2") || inputStr.equals("3")) {
                return Integer.parseInt(inputStr);
            } else {
                System.out.println("Please enter 1, 2, or 3 only.");
            }
        }
    }
}
