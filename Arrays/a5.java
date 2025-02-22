//5.	Find the average of all array elements.

package Arrays;
import java.util.*;
class a5 {
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
           
               sum=sum+a[i];
            
        }
        System.out.println((float)sum/n);
    }
}
