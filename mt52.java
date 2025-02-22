/*
2. Create a java application where need to create two custom defined exceptions like InsufficientFundsException ..
InvalidDepositException, we need to create one custom defined thread then we need to implement two
operations like deposit and withdraw with respect to user defined methods then invoke these methods based on
user input inside run method then invoke run through start.
*/
import java.util.*;

// Custom Exception for Insufficient Funds
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Deposit
class InvalidDepositException extends Exception {
    InvalidDepositException(String message) {
        super(message);
    }
}

// Bank Account Operations
class R {
    static double bal = 1000; // Initial Balance

    static void deposit(double amount) {
        if (amount < 500) {
            try {
                throw new InvalidDepositException("Error: Please deposit at least 500 or more.");
            } catch (InvalidDepositException e) {
                System.out.println(e.getMessage());
                
            }
        }
        else
        {
        bal += amount;
        System.out.println("Deposit Successful! New Balance: " + bal);
        }
    }

    static void withdraw(double amount) {
        if (amount > bal) {
            try {
                throw new InsufficientFundsException("Error: Insufficient Funds! Available Balance: " + bal);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
                
            }
        }
        else
        {
        bal -= amount;
        System.out.println("Withdrawal Successful! New Balance: " + bal);
        }
    }
}

// Custom Thread for Banking Operations
class T1 extends Thread {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("\nChoose an operation: \n1. Deposit \n2. Withdraw \n3. Exit");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.print("Enter amount to deposit: ");
                R.deposit(sc.nextDouble());
            } else if (op == 2) {
                System.out.print("Enter amount to withdraw: ");
                R.withdraw(sc.nextDouble());
            } else if (op == 3) {
                System.out.println("Exiting Banking System...");
                break;
            } else {
                System.out.println("Invalid Input! Please enter 1, 2, or 3.");
            }
        }
    }

    public static void main(String[] args) {
        T1 t = new T1();
        t.start();
    }
}
