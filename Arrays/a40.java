package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a40 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            int oc=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    oc++;
                }
            }
            b[i]=oc;

            
        }

        for(int i=0;i<n-1;i++) // use this bubble sort algo to get answer in stable 
        {
            int l=0;
            boolean k = true;
            for(int j=0;j<n-i-1;j++)
            {
                if(b[j]<b[j+1])
                {
                    b[j]=b[j]+b[j+1]-(b[j+1]=b[j]);
                    a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
        
                    k = false;
                }
            }
            if(k)
                break;
        }
/* 
        for(int i=0;i<n;i++)
        {
            int lc=0;
            for(int j=0;j<=i;j++)
            {
                if(a[i]==a[j])
                {
                    lc++;
                }
            }
            if(lc==1)
            {
                System.out.println(a[i]+" -> "+b[i]);
            }
        }
            */

            //for reduce TC use below logic for remove duplicate elements and print

            for(int i=0;i<n;i=i+b[i])
            {
                System.out.println(a[i]+" -> "+b[i]);
            }

        
    }
    
}
