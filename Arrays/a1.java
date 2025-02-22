
//1.	Declare and initialize an array and print all elements from array.
package Arrays;
import java.util.*;
 class a1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
        int arr[]={1,2,45,2,88,44,74,85};
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
