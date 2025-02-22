/*1.	Reverse the given array and print. (Not just print, reverse array elements)
Ex:- input:-{ 11 34 67}
	Output:- { 76 43 11}
 */

package Arrays;
import java.util.*;
public class a27 {
    static int rev(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            a[j]=rev(a[i]);
            j++;

        }
        int k=n-1;
        for(int i=0;i<=k;i++)
        {
            a[i]=a[i]+a[k]-(a[k]=a[i]);
            k--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
