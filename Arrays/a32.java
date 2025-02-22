/* 6.	Print common elements from two arrays. */
// we can use hashset for better solution.
//CHECK NOTES BETTER SOLUTION
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        // Array to keep track of already printed elements
        int printed[] = new int[Math.min(n, m)];
        int printedCount = 0;

        
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                if (a[j] == b[k]) {
                    // Check if the element is already printed
                    boolean alreadyPrinted = false;
                    for (int p = 0; p < printedCount; p++) {
                        if (printed[p] == a[j]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    // If not already printed, print it and add to printed array
                    if (!alreadyPrinted) {
                        System.out.print(a[j] + " ");
                        printed[printedCount++] = a[j];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(printed));
    }
}
