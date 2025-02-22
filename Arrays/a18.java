//dont do this way as we not updating array do a19.java

package Arrays;
import java.util.*;
public class a18 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        int l,r=0;
        for(int i=0;i<n;i++)
        {
            int m=n/2;
            if(i<m)
            {
                l=a[m-i-1];
                System.out.print(l+" ");
            }
            else if(i==m && m%2==1)
            {
                System.out.print(a[i]+" ");
            }
            else if(m%2==0)
            {
                r=a[n-i+m-1];
                System.out.print(r+" ");
            }
            else
            {
                r=a[n-i+m];
                System.out.print(r+" ");
            }
        }
       
    }
}
