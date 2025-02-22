//SELECTION SORT

package Arrays;

import java.util.Scanner;

public class a42 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++)
        {
            int k=0,e=n-i-1;
            for(int j=1;j<=e;j++)
            {
                if(a[j]>a[k])
                {
                    k=j;
                }
                a[k]=a[k]+a[j]-(a[j]=a[k]);

            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
