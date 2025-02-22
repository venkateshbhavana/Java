//10.	Print alternative even numbers from array.

package Arrays;
import java.util.*;
 class a10 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                c++;
                if(c%2==1)
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
