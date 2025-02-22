//2.	Read array elements from user. Ask user for size and print the elements. 

package Arrays;

import java.util.Scanner;

class a2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
