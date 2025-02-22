/*14.	Write a Program to find out the MEDIAN value of a Given Array? */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Array size must be positive.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Find the median
        double median;
        if (n % 2 == 0) {
            // Even number of elements: average of two middle values
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            // Odd number of elements: middle value
            median = arr[n / 2];
        }

        // Output the median value
        System.out.println("The median value of the given array is: " + median);
    }
}
