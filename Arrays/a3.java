//3.	Print all even numbers from array.

package Arrays;
import java.util.*;
 class a3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
