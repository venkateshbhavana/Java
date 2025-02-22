import java.util.*;

class Temple {
    private String name;
    private String timings;
    private String location;
    private String specialEvents;

    public Temple(String name, String timings, String location, String specialEvents) {
        this.name = name;
        this.timings = timings;
        this.location = location;
        this.specialEvents = specialEvents;
    }

    public String getName() {
        return name;
    }

    public String getTimings() {
        return timings;
    }

    public String getLocation() {
        return location;
    }

    public String getSpecialEvents() {
        return specialEvents;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSpecialEvents(String specialEvents) {
        this.specialEvents = specialEvents;
    }

    public void displayInfo() {
        System.out.println("\nTemple Info:");
        System.out.println("Name: " + name);
        System.out.println("Timings: " + timings);
        System.out.println("Location: " + location);
        System.out.println("Special Events: " + specialEvents);
    }
}

class TempleManagement {
    private HashMap<String, Temple> temples = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public TempleManagement() {
        // Adding 5 temples initially
        temples.put("Shiva Temple", new Temple("Shiva Temple", "6 AM - 9 PM", "Temple Road, City Center", "Every Sunday at 8 AM"));
temples.put("Venkateshwara Temple", new Temple("Venkateshwara Temple", "5 AM - 10 PM", "Hilltop, Mountain Valley", "Every Friday at 7 AM"));
temples.put("Lakshmi Temple", new Temple("Lakshmi Temple", "7 AM - 8 PM", "Main Street, Downtown", "Every Tuesday at 6 PM"));
temples.put("Kali Temple", new Temple("Kali Temple", "6 AM - 6 PM", "River Side, Green Valley", "Every Saturday at 5 PM"));
temples.put("Ganesh Temple", new Temple("Ganesh Temple", "6 AM - 9 PM", "Market Square, Old Town", "Every Monday at 9 AM"));

    }

    public HashMap<String, Temple> getTemples() {
        return temples;
    }

    public Temple getTempleByName(String name) {
        return temples.get(name);
    }

    public void addTemple(String name, String timings, String location, String specialEvents) {
        Temple temple = new Temple(name, timings, location, specialEvents);
        temples.put(name, temple);
        System.out.println("New temple added successfully!");
    }

    public void displayTempleList() {
        System.out.println("\nAvailable Temples:");
        int index = 1;
        for (String templeName : temples.keySet()) {
            System.out.println(index++ + ". " + templeName);
        }
    }
}

class UserManagement {
    private HashMap<String, User> users = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public UserManagement() {
        // Adding a default user for testing
        users.put("admin", new User("Admin", "9876543210", "admin", "Admin123@"));
    }

    public User loginUser() {
        System.out.println("\nLogin:");

        String username;
        while (true) {
            System.out.print("Enter your Username: ");
            username = scanner.nextLine();
            if (users.containsKey(username)) {
                break;
            }
            System.out.println("Invalid username! Please try again or register if you're a new user.");
        }

        String password;
        while (true) {
            System.out.print("Enter your Password: ");
            password = scanner.nextLine();
            if (users.get(username).getPassword().equals(password)) {
                System.out.println("Login successful!");
                return users.get(username);
            }
            System.out.println("Invalid password! Please try again.");
        }
    }
}

class ServicesManagement {
    private ArrayList<String> servicesChosen = new ArrayList<>();
    private ArrayList<String> prasadamChosen = new ArrayList<>();
    private int totalCost = 0;
    private Scanner scanner = new Scanner(System.in);

    public void chooseServices() {
        while (true) {
            System.out.println("\nServices:");
            System.out.println("1. Archana - Rs. 100");
            System.out.println("2. Abhishekam - Rs. 200");
            System.out.println("3. Pooja - Rs. 150");
            System.out.println("4. VIP Ticket - Rs. 500");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    servicesChosen.add("Archana");
                    totalCost += 100;
                    System.out.println("Archana booked successfully.");
                    break;
                case 2:
                    servicesChosen.add("Abhishekam");
                    totalCost += 200;
                    System.out.println("Abhishekam booked successfully.");
                    break;
                case 3:
                    servicesChosen.add("Pooja");
                    totalCost += 150;
                    System.out.println("Pooja booked successfully.");
                    break;
                case 4:
                    servicesChosen.add("VIP Ticket");
                    totalCost += 500;
                    System.out.println("VIP Ticket booked successfully.");
                    break;
                case 5:
                    System.out.println("Exiting services menu...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public void choosePrasadam() {
        while (true) {
            System.out.println("\nPrasadam:");
            System.out.println("1. Laddu - Rs. 50");
            System.out.println("2. Pulihora - Rs. 30");
            System.out.println("3. Dadojanam - Rs. 40");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    prasadamChosen.add("Laddu");
                    totalCost += 50;
                    System.out.println("Laddu added to your list.");
                    break;
                case 2:
                    prasadamChosen.add("Pulihora");
                    totalCost += 30;
                    System.out.println("Pulihora added to your list.");
                    break;
                case 3:
                    prasadamChosen.add("Dadojanam");
                    totalCost += 40;
                    System.out.println("Dadojanam added to your list.");
                    break;
                case 4:
                    System.out.println("Exiting prasadam menu...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public void displayPayments() {
        System.out.println("\nPayments:");
        System.out.println("Total amount to be paid: Rs. " + totalCost);
        System.out.println("Select a payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI");
        int paymentChoice = scanner.nextInt();
        scanner.nextLine();

        String paymentMethod = "";
        switch (paymentChoice) {
            case 1:
                paymentMethod = "Credit Card";
                break;
            case 2:
                paymentMethod = "Debit Card";
                break;
            case 3:
                paymentMethod = "UPI";
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Payment of Rs. " + totalCost + " completed using " + paymentMethod + "!");
    }
}

class User {
    private String name;
    private String mobile;
    private String username;
    private String password;

    public User(String name, String mobile, String username, String password) {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class TempleManagementSystem {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        TempleManagement templeManagement = new TempleManagement();
        ServicesManagement servicesManagement = new ServicesManagement();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\nWelcome to Temple Management System!");
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Register");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Admin login...");
                    User admin = userManagement.loginUser();
                    if (admin.getUsername().equals("admin")) {
                        adminHomePage(templeManagement);
                    }
                    break;
                }
                case 2: {
                    User user = userManagement.loginUser();
                    userHomePage(user, templeManagement, servicesManagement);
                    break;
                }
                case 3:
                    System.out.println("Register a new user...");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    static void adminHomePage(TempleManagement templeManagement) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Temple");
            System.out.println("2. View Temples");
            System.out.println("3. Update Temple Info");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Temple Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Temple Timings: ");
                    String timings = scanner.nextLine();
                    System.out.print("Enter Temple Location: ");
                    String location = scanner.nextLine();
                    System.out.print("Enter Special Events: ");
                    String specialEvents = scanner.nextLine();
                    templeManagement.addTemple(name, timings, location, specialEvents);
                    break;
                case 2:
                    templeManagement.displayTempleList();
                    break;
                case 3:
                    System.out.print("Enter Temple Name to Update: ");
                    String templeName = scanner.nextLine();
                    Temple temple = templeManagement.getTempleByName(templeName);
                    if (temple != null) {
                        System.out.print("Enter New Timings: ");
                        timings = scanner.nextLine();
                        System.out.print("Enter New Location: ");
                        location = scanner.nextLine();
                        System.out.print("Enter New Special Events: ");
                        specialEvents = scanner.nextLine();
                        temple.setTimings(timings);
                        temple.setLocation(location);
                        temple.setSpecialEvents(specialEvents);
                        System.out.println("Temple info updated successfully!");
                    } else {
                        System.out.println("Temple not found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting admin menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    static void userHomePage(User user, TempleManagement templeManagement, ServicesManagement servicesManagement) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\nUser Menu:");
            System.out.println("1. Temples");
            System.out.println("2. Contact Info");
            System.out.println("3. Profile");
            System.out.println("4. Payments");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    templeManagement.displayTempleList();
                    System.out.print("Select a temple: ");
                    String templeName = scanner.nextLine();
                    Temple temple = templeManagement.getTempleByName(templeName);
                    if (temple != null) {
                        temple.displayInfo();
                        templeMenu(servicesManagement);
                    } else {
                        System.out.println("Invalid temple selected!");
                    }
                    break;
                case 2:
                    System.out.println("\nContact Info:");
                    System.out.println("Admin Phone Number: +91-9876543210");
                    System.out.println("Email: admin@temple.com");
                    break;
                case 3:
                    System.out.println("\nProfile:");
                    System.out.println("Name: " + user.getName());
                    System.out.println("Mobile: " + user.getMobile());
                    System.out.println("Username: " + user.getUsername());
                    break;
                case 4:
                    servicesManagement.displayPayments();
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    static void templeMenu(ServicesManagement servicesManagement) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\nTemple Menu:");
            System.out.println("1. Info");
            System.out.println("2. Services");
            System.out.println("3. Prasadam");
            System.out.println("4. Payments");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Showing temple info...");
                    break;
                case 2:
                    servicesManagement.chooseServices();
                    break;
                case 3:
                    servicesManagement.choosePrasadam();
                    break;
                case 4:
                    servicesManagement.displayPayments();
                    break;
                case 5:
                    System.out.println("Exiting temple menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
