//11.	Find the sum of the numbers upto the given key value(index) in a given array?

package Arrays;

import java.util.Scanner;

class a11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }
        System.out.print("enter index value : ");
        int in=sc.nextInt();
        int sum=0;
        for(int i=0;i<=in;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println();
        System.out.print(sum);
    }
}
