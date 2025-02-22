//8.	Find the sum of first and last element in array.

package Arrays;
import java.util.*;
 class a8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int sum=a[0]+a[n-1];
        System.out.println(sum);
    }
}
