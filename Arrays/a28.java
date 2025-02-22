/*	Input: {3,4,2,1,3,5}, 
    Output: {3^1, 4^2,2^3,1^4,3^5,5^6}={3,16,8,1,243,15625}	
    Input: {3,4,2,1,3,5}, 
    Output: {3^1, 4^2,2^3,1^4,3^5,5^6}={3,16,8,1,243,15625} */

package Arrays;

import java.util.Scanner;

public class a28 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
             a[i]=(int)Math.pow(a[i],i+1);  // dont do any operation while taking input it will make error in leetcode
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
