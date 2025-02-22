package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class a43 {
    static int[] insertelement(int[] a, int k) {
        int n = a.length;
        int[] b = new int[n + 1]; // New array with one extra space

        boolean inserted = false; // Flag to check if 'k' is inserted

        for (int i = 0, j = 0; i < n; i++, j++) {
            if (!inserted && k < a[i]) {
                // Insert 'k' before the current element
                b[j] = k;
                inserted = true;
                j++; // Move to the next position for copying
            }
            // Copy the current element from the original array
            b[j] = a[i];
        }

        // If 'k' is greater than all elements, insert it at the end
        if (!inserted) {
            b[n] = k;
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        int n = sc.nextInt();

        // Input the array elements
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Input the element to be inserted
        int k = sc.nextInt();

        // Call the function and print the result
        int[] result = insertelement(a, k);
        System.out.println(Arrays.toString(result));
    }
}
