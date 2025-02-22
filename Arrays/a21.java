package Arrays;
import java.util.*;
public class a21 {
    static void sort(int a[],int s, int e)
    {
        // instead of these we can also use buublesort, insertion sort and any sorting methods.                         
        
        for(int i=s;i<=e;i++)
        {
            for(int j=i+1;j<=e;j++)
            {
                if(a[i]>a[j])
                {
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
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