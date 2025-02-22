
/*2.	Write a java program that performs the following tasks.
a.	Store a number in a variable
b.	If value is not in range (100-1000) prints wrong number else follows the steps
c.	Check even or odd
d.	If even divide the number by 3 and print the remainder
e.	If odd divide the number by 2 and print the remainder. 
*/
import java.util.Scanner;

public class eoro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the lower and upper bounds from user input
        System.out.println("Enter the lower bound of the range:");
        int lowerBound = sc.nextInt();

        System.out.println("Enter the upper bound of the range:");
        int upperBound = sc.nextInt();

        // Take the number to check from user input
        System.out.println("Enter a number to check:");
        int n = sc.nextInt();

        // Check if the number is within the specified range
        if (n < lowerBound || n > upperBound) {
            System.out.println("Wrong number");
        } else {
            // Check if the number is even or odd
            if (n % 2 == 0) {
                // If even, divide by 3 and print the remainder
                int remainder = n % 3;
                System.out.println("The number is even. Remainder when divided by 3: " + remainder);
            } else {
                // If odd, divide by 2 and print the remainder
                int remainder = n % 2;
                System.out.println("The number is odd. Remainder when divided by 2: " + remainder);
            }
        }

    }
}
