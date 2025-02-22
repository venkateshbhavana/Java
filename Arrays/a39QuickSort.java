package Arrays;

import java.util.Scanner;

public class a39QuickSort {

    static void QuickSort(int a[],int s,int e)
    {
        if(s>e)
        {
            return;
        }
        int j=partition(a,s,e);
        QuickSort(a, s, j-1);
        QuickSort(a, j+1, e);
    }
    static int partition(int a[],int s,int e)
    {
        int p=s,i=s+1,j=e;
        while(true)
        {
           while(i<=e && a[p]>=a[i])
           {
            i++;
           }
           while(j>=s && a[p]<a[j])
           {
               j--;
           }
           if(i<j)
           {
            a[i]=a[i]+a[j]-(a[j]=a[i]);
           }
           else
           {
            a[p]=a[p]+a[j]-(a[j]=a[p]);
            break;
           }
        }
        return j;
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
        QuickSort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
