import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {

    // Stores user credentials (username -> password)
    static HashMap<String, String> users = new HashMap<>();
    // List of temples
    static ArrayList<Temple> temples = new ArrayList<>();
    // Admin credentials
    static String adminUsername = "admin";
    static String adminPassword = "admin123";

    public static void main(String[] args) {
        // Adding default temples with info and services
        addDefaultTemples();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Admin Login");
            System.out.println("4. Quit");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    loginUser(scanner);
                    break;
                case 3:
                    adminLogin(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }

    // Method to add default temples with info and services
    static void addDefaultTemples() {
        temples.add(new Temple("Hanuman", "A temple dedicated to Lord Hanuman.", new String[]{"Pooja", "Prayers", "Blessings"}));
        temples.add(new Temple("Shiva", "A temple dedicated to Lord Shiva.", new String[]{"Rituals", "Meditation", "Blessings"}));
        temples.add(new Temple("Durga", "A temple dedicated to Goddess Durga.", new String[]{"Festivals", "Pooja", "Blessings"}));
    }

    // Method to register a user
    static void registerUser(Scanner scanner) {
        System.out.println("Enter username:");
        String username = scanner.nextLine();

        // Check if the user already exists
        if (users.containsKey(username)) {
            System.out.println("User already exists!");
            return;
        }

        String password;
        // Ask for password and validate
        while (true) {
            System.out.println("Enter password (At least one uppercase letter and one special character):");
            password = scanner.nextLine();

            // Validate password
            if (isValidPassword(password)) {
                break;  // Password is valid, exit loop
            } else {
                System.out.println("Password must contain at least one uppercase letter and one special character. Please try again.");
            }
        }

        // Register the user
        users.put(username, password);
        System.out.println("Registration successful!");
    }

    // Method to validate password
    static boolean isValidPassword(String password) {
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        // Check if password contains at least one uppercase letter and one special character
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        // Return true if both conditions are met
        return hasUpperCase && hasSpecialChar;
    }

    // Method to login a user
    static void loginUser(Scanner scanner) {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        // Check if the user exists and password matches
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
            userMenu(scanner);  // Enter user menu after successful login
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    // Method for admin login
    static void adminLogin(Scanner scanner) {
        System.out.println("Enter admin username:");
        String username = scanner.nextLine();
        System.out.println("Enter admin password:");
        String password = scanner.nextLine();

        // Check if admin credentials are correct
        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("Admin login successful!");
            adminMenu(scanner);
        } else {
            System.out.println("Invalid admin credentials.");
        }
    }

    // User menu to interact with temples
    static void userMenu(Scanner scanner) {
        int choice = 0;

        while (choice != 3) {
            System.out.println("\nUser Menu:");
            System.out.println("1. View Temples");
            System.out.println("2. Logout");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    viewTemples(scanner);
                    break;
                case 2:
                    System.out.println("Logging out...");
                    return;  // Exit the user menu and return to home screen
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Admin menu to manage temples
    static void adminMenu(Scanner scanner) {
        int choice = 0;

        while (choice != 4) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Temple");
            System.out.println("2. Remove Temple");
            System.out.println("3. View Temples");
            System.out.println("4. Logout");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    addTemple(scanner);
                    break;
                case 2:
                    removeTemple(scanner);
                    break;
                case 3:
                    viewTemples(scanner);
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;  // Exit admin menu and return to home screen
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Method to add a temple
    static void addTemple(Scanner scanner) {
        System.out.println("Enter the name of the temple to add:");
        String templeName = scanner.nextLine();

        System.out.println("Enter the information about the temple:");
        String templeInfo = scanner.nextLine();

        System.out.println("Enter the services provided by the temple (comma separated):");
        String servicesInput = scanner.nextLine();
        String[] services = servicesInput.split(",");

        // Add the temple to the list
        temples.add(new Temple(templeName, templeInfo, services));
        System.out.println("Temple added successfully.");
    }

    // Method to remove a temple
    static void removeTemple(Scanner scanner) {
        System.out.println("Enter the name of the temple to remove:");
        String templeName = scanner.nextLine();

        // Remove the temple if it exists
        Temple templeToRemove = null;
        for (Temple temple : temples) {
            if (temple.getName().equalsIgnoreCase(templeName)) {
                templeToRemove = temple;
                break;
            }
        }

        if (templeToRemove != null) {
            temples.remove(templeToRemove);
            System.out.println("Temple removed successfully.");
        } else {
            System.out.println("Temple not found.");
        }
    }

    // Method to view all temples and let users select one
    static void viewTemples(Scanner scanner) {
        if (temples.isEmpty()) {
            System.out.println("No temples available.");
            return;
        }

        System.out.println("\nList of Temples:");
        for (int i = 0; i < temples.size(); i++) {
            System.out.println((i + 1) + ". " + temples.get(i).getName());
        }

        System.out.println("\nEnter the number of the temple to select (or 0 to go back):");
        int templeChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        if (templeChoice == 0) {
            return;  // Go back to the previous menu
        } else if (templeChoice > 0 && templeChoice <= temples.size()) {
            Temple selectedTemple = temples.get(templeChoice - 1);
            templeMenu(scanner, selectedTemple);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Menu when a temple is selected
    static void templeMenu(Scanner scanner, Temple temple) {
        int choice = 0;

        while (choice != 3) {
            System.out.println("\nYou selected: " + temple.getName());
            System.out.println("1. View Info");
            System.out.println("2. View Services");
            System.out.println("3. Go Back");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Temple Info: " + temple.getInfo());
                    break;
                case 2:
                    System.out.println("Services offered:");
                    for (String service : temple.getServices()) {
                        System.out.println("- " + service);
                    }
                    break;
                case 3:
                    return;  // Go back to temple list
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

// Temple class to represent each temple
class Temple {
    private String name;
    private String info;
    private String[] services;

    public Temple(String name, String info, String[] services) {
        this.name = name;
        this.info = info;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String[] getServices() {
        return services;
    }
}