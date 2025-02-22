package Arrays;
import java.util.*;
public class a22 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int s=0,e=n-1;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(k==a[m])
            {
                System.out.println("found");
                break;
            }
            else if(k<a[m])
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        if(s>e)
        {
            System.out.println("Not found");
        }
    }
}
