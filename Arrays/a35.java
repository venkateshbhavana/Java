/*13.	Write a Program to find out the MEAN value of a Given Array? */

package Arrays;

import java.util.Scanner;

public class a35 {
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

        // Calculate the sum of elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Calculate mean
        double mean = (double) sum / n;

        // Output the mean value
        System.out.println("The mean value of the given array is: " + mean);
    }
}
