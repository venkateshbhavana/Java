/*7.	Merge two arrays into a single array.
Ex:- input:-{ 1 2 3 } { 10 20 30 }
	Output:- { 1 2 3 10 20 30 }
Ex:- input:-{ 3 6 2 8 } { 10 20 30 }
	Output:- { 3 6 2 8 10 20 30 }
 */


package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a33 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
             b[i]=sc.nextInt();
        }
         int k=m+n;
         int j=0,l=0;
        int c[]=new int[k];
        for(int i=0;i<k;i++)
        {

            if(j<n)
            {
                c[i]=a[j];
                j++;
            }
            else if(l<m)
            {
                c[i]=b[l];
                l++;
            }
        }
        for(int e:c)
        {
            System.out.print(e+" ");
        }
        System.out.println(); // difference b/w normal for loop printing array elements and using pre defined tostring method.
        System.out.print(Arrays.toString(c));
    }
}
