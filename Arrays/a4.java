//4.	Find the sum of all odd numbers from array.

package Arrays;
import java.util.*;
 class a4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
            {
               sum=sum+a[i];
            }
        }
        System.out.println(sum);
    }
}
