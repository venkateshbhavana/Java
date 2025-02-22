package Arrays;
import java.util.*;
public class a20 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        int j=n-1;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]!=0)
            {
                a[i]=a[i]+a[j]-(a[j]=a[i]);
                
                j--;
                
            }
        }
        for(int i:a)
        {
          
            System.out.print(i+" ");
        }
    }
}
