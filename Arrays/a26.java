package Arrays;

import java.util.Scanner;

public class a26 {
    static int[] rotate(int a[],int k)
    {
        
        int n=a.length;
        int s=0;
        sort(a,s,k-1);
        sort(a,k,n-1);
        sort(a,s,n-1);
        return a;
    }
    static int[] sort(int a[],int s,int e)
    {
        for(int i=s;i<e;i++)
        {
            a[i]=a[i]+a[e]-(a[e]=a[i]);
            e--;
        }
        return a;
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		
		int k=sc.nextInt();
		rotate(a,k);
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}
	
	}
}
