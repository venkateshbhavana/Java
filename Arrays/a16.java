//1.	Find the biggest Element and Smallest Element from array.

package Arrays;
import java.util.*;

class a16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initializing max & min with the first element of the array
        int max = arr[0];
        int min=arr[0];
        // Finding the maximum element
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Highest number in Array: " + max);
        System.out.println("Smallest number in Array: " + min);
    }
}
