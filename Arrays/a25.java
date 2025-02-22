package Arrays;

import java.util.Scanner;

public class a25 {

    static boolean isSorted(int[] a)
    {
        int i,n=a.length;
        for( i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                return false;
            }
        }
       return true;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        if(isSorted(a)){
           System.out.println("Already Sorted.");
           return;
        }
        int i,r=0,k;
        for( i=0;i<n;i++)
        {
           k=a[0];
           for(int j=0;j<n-1;j++)
           {
            a[j]=a[j+1];
           }
           a[n-1]=k;
           r++;
        if(isSorted(a)){
            break;
           }
        }
        if(i==n)
        {
           System.out.print(-1);
        }
        else{
        System.out.println("Sorted at "+r+" Rotation.");
        }
        
    }
}
