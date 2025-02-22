import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Login{

    static HashMap<String, String> users = new HashMap<>();  // Stores usernames and passwords
    static HashMap<String, String> otps = new HashMap<>();    // Stores OTPs for verification
    static HashMap<String, String> userMobile = new HashMap<>(); // Stores usernames and their mobile numbers
    static HashMap<String, Integer> serviceCosts = new HashMap<>(); // Stores service costs
    static HashMap<String, String> temples = new HashMap<>(); // Stores temples information

    // Admin credentials (hardcoded for simplicity)
    static String adminUsername = "admin";
    static String adminPassword = "admin123";

    static {
        // Populate service costs
        serviceCosts.put("Prayers", 50);       // Example cost
        serviceCosts.put("Archana", 100);
        serviceCosts.put("Abhishekam", 150);

        // Initialize with a few temples
        temples.put("Durga Temple", "Located in various places across India.");
        temples.put("Shiva Temple", "Dedicated to Lord Shiva.");
        temples.put("Hanuman Temple", "Dedicated to Lord Hanuman.");
        temples.put("Ganesh Temple", "Dedicated to Lord Ganesha.");
        temples.put("Ram Mandir", "Dedicated to Lord Ram.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("Select an option: ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Admin Login");
            System.out.println("4. Quit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    loginUser(scanner, scanner);
                    break;
                case 3:
                    adminLogin(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }

    static void registerUser(Scanner scanner) {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.println("User already exists.");
            return;
        }

        String mobileNumber = "";
        while (true) {
            System.out.println("Enter your mobile number (10 digits):");
            mobileNumber = scanner.nextLine();
            if (isValidMobileNumber(mobileNumber)) {
                break;
            } else {
                System.out.println("Invalid mobile number. Please enter a 10-digit mobile number.");
            }
        }

        if (userMobile.containsKey(mobileNumber)) {
            System.out.println("Mobile number already registered.");
            return;
        }

        String password = "";
        while (true) {
            System.out.println("Enter your password (min 5 chars, at least one uppercase letter, one special character):");
            password = scanner.nextLine();
            if (isValidPassword(password)) {
                break;
            } else {
                System.out.println("Password does not meet the required criteria.");
            }
        }

        String otp = generateOTP();
        otps.put(username, otp); // Store OTP for user
        userMobile.put(username, mobileNumber); // Store mobile number associated with the username

        System.out.println("Your OTP for verification is: " + otp);
        System.out.println("Enter OTP to complete registration:");

        String enteredOtp = scanner.nextLine();
        if (enteredOtp.equals(otp)) {
            users.put(username, password);
            System.out.println("Registration successful.");
        } else {
            System.out.println("Invalid OTP. Registration failed.");
        }

        otps.remove(username);
    }

    static void loginUser(Scanner scanner, Scanner inputScanner) {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = inputScanner.nextLine();

        if (!users.containsKey(username)) {
            System.out.println("Invalid username or password.");
        } else {
            if (users.get(username).equals(password)) {
                System.out.println("Login successful.");
                showLoginMenu(inputScanner);
            } else {
                System.out.println("Invalid username or password.");
            }
        }
    }

    static void showLoginMenu(Scanner scanner) {
        int choice = 0;
        while (choice != 2) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Temples");
            System.out.println("2. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    selectTemple(scanner);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void selectTemple(Scanner scanner) {
        // Display temple options with numbers
        System.out.println("\nSelect a temple to view:");
        System.out.println("1. Durga Temple");
        System.out.println("2. Shiva Temple");
        System.out.println("3. Hanuman Temple");
        System.out.println("4. Ganesh Temple");
        System.out.println("5. Ram Mandir");
        int templeChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (templeChoice) {
            case 1:
                viewTempleOptions("Durga Temple", scanner);
                break;
            case 2:
                viewTempleOptions("Shiva Temple", scanner);
                break;
            case 3:
                viewTempleOptions("Hanuman Temple", scanner);
                break;
            case 4:
                viewTempleOptions("Ganesh Temple", scanner);
                break;
            case 5:
                viewTempleOptions("Ram Mandir", scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    static void viewTempleOptions(String templeName, Scanner scanner) {
        int choice = 0;
        while (choice != 3) {
            System.out.println("\nYou selected: " + templeName);
            System.out.println("1. View Info");
            System.out.println("2. View Services");
            System.out.println("3. Back to Temples");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    viewTempleInfo(templeName);
                    break;
                case 2:
                    viewTempleServices(templeName, scanner);
                    break;
                case 3:
                    return;  // Go back to the temples list
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void viewTempleInfo(String templeName) {
        System.out.println(temples.get(templeName));
    }

    static void viewTempleServices(String templeName, Scanner scanner) {
        System.out.println("Services offered at " + templeName + ":");
        System.out.println("1. Prayers (Cost: 50 per person)");
        System.out.println("2. Archana (Cost: 100 per person)");
        System.out.println("3. Abhishekam (Cost: 150 per person)");

        int serviceChoice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        int serviceCost = 0;
        String serviceName = "";

        switch (serviceChoice) {
            case 1:
                serviceCost = serviceCosts.get("Prayers");
                serviceName = "Prayers";
                break;
            case 2:
                serviceCost = serviceCosts.get("Archana");
                serviceName = "Archana";
                break;
            case 3:
                serviceCost = serviceCosts.get("Abhishekam");
                serviceName = "Abhishekam";
                break;
            default:
                System.out.println("Invalid service.");
                return;
        }

        System.out.println("Enter the number of persons:");
        int numPersons = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        int totalCost = serviceCost * numPersons;
        System.out.println("Total cost for " + numPersons + " persons for " + serviceName + ": " + totalCost);

        System.out.println("Do you want any additional services? (Enter 1 for Yes, 2 for No)");
        int additionalServices = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        if (additionalServices == 1) {
            viewTempleServices(templeName, scanner);
        } else if (additionalServices == 2) {
            generateBill(totalCost, scanner);
        } else {
            System.out.println("Invalid choice. Exiting.");
        }
    }

    static void generateBill(int totalCost, Scanner scanner) {
        System.out.println("Total Bill: " + totalCost);

        System.out.println("Select payment method:");
        System.out.println("1. PhonePe");
        System.out.println("2. GPay");
        System.out.println("3. Credit Card");
        int paymentMethod = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        String paymentDetails = "";
        switch (paymentMethod) {
            case 1:
                paymentDetails = getValidPhonePeDetails(scanner);
                break;
            case 2:
                paymentDetails = getValidGPayDetails(scanner);
                break;
            case 3:
                paymentDetails = getValidCreditCardDetails(scanner);
                break;
            default:
                System.out.println("Invalid payment method. Exiting.");
                return;
        }

        System.out.println("Payment of " + totalCost + " successful using " + (paymentMethod == 3 ? "Credit Card" : (paymentMethod == 2 ? "GPay" : "PhonePe")) + ".");
        
        // Exit after showing billing summary
        displayBillSummary(totalCost, paymentDetails);
        System.out.println("Exiting...");
    }

    static String getValidPhonePeDetails(Scanner scanner) {
        String phonePeNumber = "";
        String upi = "";

        while (true) {
            System.out.println("Enter your 10-digit mobile number linked to PhonePe:");
            phonePeNumber = scanner.nextLine();
            if (isValidMobileNumber(phonePeNumber)) {
                break;
            } else {
                System.out.println("Invalid mobile number. Please enter a 10-digit mobile number.");
            }
        }

        while (true) {
            System.out.println("Enter your UPI ID linked to PhonePe (must be in format <mobile number>@<bank>):");
            upi = scanner.nextLine();
            if (isValidUPI(upi)) {
                break;
            } else {
                System.out.println("Invalid UPI format. Please enter a valid UPI ID.");
            }
        }
        return "PhonePe: " + phonePeNumber + ", UPI: " + upi;
    }

    static String getValidGPayDetails(Scanner scanner) {
        String gpayNumber = "";
        String upi = "";

        while (true) {
            System.out.println("Enter your 10-digit mobile number linked to GPay:");
            gpayNumber = scanner.nextLine();
            if (isValidMobileNumber(gpayNumber)) {
                break;
            } else {
                System.out.println("Invalid mobile number. Please enter a 10-digit mobile number.");
            }
        }

        while (true) {
            System.out.println("Enter your UPI ID linked to GPay (must be in format <mobile number>@<bank>):");
            upi = scanner.nextLine();
            if (isValidUPI(upi)) {
                break;
            } else {
                System.out.println("Invalid UPI format. Please enter a valid UPI ID.");
            }
        }
        return "GPay: " + gpayNumber + ", UPI: " + upi;
    }

    static String getValidCreditCardDetails(Scanner scanner) {
        String cardNumber = "";
        String mobileNumber = "";

        while (true) {
            System.out.println("Enter your credit card number:");
            cardNumber = scanner.nextLine();
            if (cardNumber.matches("\\d{16}")) { // Validating a 16-digit credit card number
                break;
            } else {
                System.out.println("Invalid card number. Please enter a valid 16-digit credit card number.");
            }
        }

        while (true) {
            System.out.println("Enter your mobile number linked to credit card:");
            mobileNumber = scanner.nextLine();
            if (isValidMobileNumber(mobileNumber)) {
                break;
            } else {
                System.out.println("Invalid mobile number. Please enter a 10-digit mobile number.");
            }
        }

        return "Credit Card: " + cardNumber + ", Mobile: " + mobileNumber;
    }

    static void displayBillSummary(int totalCost, String paymentDetails) {
        System.out.println("\n----- BILL SUMMARY -----");
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Payment Details: " + paymentDetails);
        System.out.println("-----------------------");
    }

    static String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000); // Generates a 6-digit OTP
        return String.valueOf(otp);
    }

    static boolean isValidMobileNumber(String mobileNumber) {
        return mobileNumber.matches("\\d{10}");
    }

    static boolean isValidPassword(String password) {
        return password.length() >= 5 &&
               password.matches(".[A-Z].") &&  // at least one uppercase letter
               password.matches(".[!@#$%^&(),.?\":{}|<>].");  // at least one special character
    }

    static boolean isValidUPI(String upi) {
        return upi.matches("\\d{10}@\\w+"); // Validates UPI format as <10 digits>@<bank>
    }

    // Admin login functionality
    static void adminLogin(Scanner scanner) {
        System.out.println("Enter admin username:");
        String username = scanner.nextLine();
        System.out.println("Enter admin password:");
        String password = scanner.nextLine();

        if (adminUsername.equals(username) && adminPassword.equals(password)) {
            System.out.println("Admin login successful.");
            adminMenu(scanner);
        } else {
            System.out.println("Invalid admin credentials.");
        }
    }

    static void adminMenu(Scanner scanner) {
        int choice = 0;
        while (choice != 4) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. View Temples");
            System.out.println("2. Add Temple");
            System.out.println("3. Remove Temple");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    viewAllTemples();
                    break;
                case 2:
                    addTemple(scanner);
                    break;
                case 3:
                    removeTemple(scanner);
                    break;
                case 4:
                    System.out.println("Exiting admin menu.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void viewAllTemples() {
        System.out.println("\nList of Temples:");
        temples.forEach((name, info) -> System.out.println(name + ": " + info));
    }

    static void addTemple(Scanner scanner) {
        System.out.println("Enter the temple name:");
        String name = scanner.nextLine();
        System.out.println("Enter temple information:");
        String info = scanner.nextLine();

        temples.put(name, info);
        System.out.println("Temple added successfully.");
    }

    static void removeTemple(Scanner scanner) {
        System.out.println("Enter the temple name to remove:");
        String name = scanner.nextLine();

        if (temples.containsKey(name)) {
            temples.remove(name);
            System.out.println("Temple removed successfully.");
        } else {
            System.out.println("Temple not found.");
        }
    }
}