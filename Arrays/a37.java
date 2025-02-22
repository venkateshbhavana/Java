/*15.	Write a Program to find out the MODE value of a Given Array? */

package Arrays;

import java.util.Scanner;

public class a37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        
        int hf = 1; // Highest frequency starts at 1 (minimum frequency)
        int[] modes = new int[n]; // Array to store potential modes
        int modeCount = 0; // Count of modes found

        // Loop through the array to calculate frequency of each element
        for (int i = 0; i < n; i++) {
            int oc = 0; // Occurrence counter for a[i]
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    oc++;
                }
            }

            // If the current element has a higher frequency, reset the modes array
            if (oc > hf) {
                hf = oc;
                modeCount = 0;
                modes[modeCount++] = a[i];
            } 
            // If the current element matches the highest frequency, add to modes
            else if (oc == hf) {
                boolean isDuplicate = false;
                for (int k = 0; k < modeCount; k++) {
                    if (modes[k] == a[i]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    modes[modeCount++] = a[i];
                }
            }
        }

        
        if (hf == 1) {
            System.out.println("No mode. All elements appear only once.");
        } else {
            System.out.print("The mode values of the given array is: ");
            for (int i = 0; i < modeCount; i++) {
                System.out.print(modes[i] + " ");
            }
            System.out.println();
        }
    }
}
