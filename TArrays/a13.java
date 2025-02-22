package TArrays;
import java.util.*;

public class a13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
      
        int a[][] = new int[r][c];
        
        // Input the matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        // Step 1: Reverse the columns
   
        for (int i = 0; i < r; i++) {
            int start = 0, end = c - 1;
            while (start < end) {
                int temp = a[i][start];
                a[i][start] = a[i][end];
                a[i][end] = temp;
                start++;
                end--;
            }
        }
        
        
        // Step 2: Transpose the matrix
        for (int i = 0; i < r; i++) {
            for (int j = i+1; j < c; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        

        // Print the rotated matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
