package Arrays;

import java.util.Scanner;

public class a45 {
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
        int next=k;
        boolean b=false;
        while(true)
        {
            next++;
            for(int i=0;i<n;i++)
            {
               if(next==a[i])
               {
                b=true;
               }
            }
            if(b)
            {
                System.out.println(next);
                break;
            }

        }
   
    }
}
