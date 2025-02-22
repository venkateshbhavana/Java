package TArrays;
import java.util.*;

public class a12 {
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
        
        // Step 1: Reverse the rows
        for (int i = 0; i < r / 2; i++) {
            int temp[] = a[i];
            a[i] = a[r - i - 1];
            a[r - i - 1] = temp;
        }

        /*Note: dont use this approch because you trying 2d approach 2 forloops tc is high.
        OR Step 1: Reverse the rows
         * for (int i = 0; i < r / 2; i++) {
            for(int j=0;j<c;j++)
            {
            int temp = a[i][j];
            a[i][j] = a[r - i - 1][j];
            a[r - i - 1][j] = temp;
            }
        }
         */
        
        // Step 2: Transpose the matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
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
