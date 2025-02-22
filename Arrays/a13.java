package Arrays;

import java.util.*;
 class a13 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
             b[i]=sc.nextInt();
        }
        int h=(n>m)?n:m;
        for(int i=0;i<h;i++)
        {
            if(i<n && i<m)
            {
                System.out.print(a[i]+b[i]+" ");
            }
            else if(i<n)
            {
                System.out.print(a[i]+" ");
            }
            else{
           
            System.out.print(b[i]+" ");
            }
        }
    }
}
