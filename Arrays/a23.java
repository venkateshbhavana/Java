//2.	Find the GCD of given array elements?

package Arrays;
import java.util.*;
public class a23 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=a[0];
        for(int i=0;i<n;i++)
        {
           if(a[i]<s)
           {
            s=a[i];
           }
        }
        for(int i=s;i>=1;i--)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]%i==0)
                {
                    c++;
                }
            }
            if(c==n)
            {
                System.out.print(i);
                break;
            }
        }

    }
}
