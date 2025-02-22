package Arrays;

/*Using Method */

import java.util.*;
public class a19 {
    static void sort(int a[],int s, int e)
    {
        
        for(int i=s;i<=e;i++)
        {
            
                    a[i]=a[i]+a[e]-(a[e]=a[i]);  //swapping half arrays in reverse.
                    e--;
                
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int mid=n/2;
        sort(a,0,mid-1); //1st half array sorted

        if(n%2==0)//2nd half array sorted
        {
            sort(a,mid,n-1);
        }
        else
        {
            sort(a,mid+1,n-1);
        }
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
       
        
}


/*
 *  // Divide the array into two halves
        int mid = n / 2;

        // Sort the first half in ascending order
        Arrays.sort(a, 0, mid);

        // Sort the second half in ascending order
        Arrays.sort(a, mid, n);

        // Print the modified array
        System.out.println("Modified array after silly sort:");
 */
/* 
public class a19 {
    public static void main(String ar[])
    {
        int a[]={10 ,20 ,30, 40 ,50 ,60, 70, 80, 90, 100, 110,120};
        int n=a.length;
        int i=0;
        int j=n-1;
        int k=n/2-1;
        int m;
        if(n%2==0)
        {
            m=n/2;
        }
        else
        {
            m=n/2+1;
        }
        while(i<k)
        {
            a[i]=a[i]+a[k]-(a[k]=a[i]);
            i++;
            k--;
        }
        while(m<j)
        {
            a[m]=a[m]+a[j]-(a[j]=a[m]);
            m++;
            j--;
        }
        for(int x:a)
        {
            System.out.print(x+" ");
        }

    }
}

*/