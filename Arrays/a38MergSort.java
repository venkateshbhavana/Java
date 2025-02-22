package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a38MergSort {

    static int[] split(int a[])
    {
         int n=a.length;
         if(n==1)
         {
            return a;
         }
         int mid=n/2;
         int left[]=split(Arrays.copyOfRange(a,0,mid));
         int right[]=split(Arrays.copyOfRange(a,mid,n));

         return mergeSort(left,right);
    }
    static int[] mergeSort(int left[],int right[])
    {
        int n=left.length,m=right.length;
        int mix[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(left[i]<right[j])
            {
                mix[k++]=left[i++];
            }
            else
            {
                mix[k++]=right[j++];
            }
        }
        while(i<n)
        {
            mix[k++]=left[i++];
        }
        while (j<m) {
            mix[k++]=right[j++];
        }
        return mix;
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
        a=split(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
