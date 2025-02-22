//6.	Find the average of all prime numbers from array.

package Arrays;
import java.util.*;
 class a6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0,c=0;
        for(int i=0;i<n;i++)
        {
            int fc=0;
           for(int j=2;j<=Math.sqrt(a[i]);j++)
           {
              if(a[i]%j==0)
              {
                fc++;
              }
           }
           if(fc==0 && a[i]!=1)
           {
            c++;
             sum=sum+a[i];
             System.out.print(a[i]+" "); //no need
           }
            
        }
        System.out.println();
        System.out.println((float)sum/c);
    }
}
