import java.util.Scanner;

class edgeDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input to define the outermost number (like 5 in the given pattern)

        int size = 2 * n - 1;  // Calculate the size of the matrix (for n=5, size = 9)

        // Loop through rows (starting from 1)
        for (int i = 1; i <= size; i++) {
            // Loop through columns (starting from 1)
            for (int j = 1; j <= size; j++) {
                // Calculate the minimum distance to the edges
                int min = Math.min(Math.min(i - 1, j - 1), Math.min(size - i, size - j));

                // Print the number based on distance from the edge
                System.out.print(n - min + " ");
            }
            System.out.println();  // Move to the next row
        }

        sc.close();
    }
}
