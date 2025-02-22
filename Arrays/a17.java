package Arrays;
import java.util.*;
public class a17 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int dh=0;
        int h=Integer.MIN_VALUE; // or h=0 or h=a[0]; because we checking 1st highest digit sum,if numis -ve also digitsare +ve only na.
        for(int i=0;i<n;i++)
        {
            int ds=digitSum(a[i]);
            if(ds>dh){
                dh=ds;
                h=a[i];
            }
        }
        System.out.print(h+" --> "+dh);
    }
    static int digitSum(int n)
    {
        int sum=0;
        while(n>0)
        {
           int r=n%10;
           sum=sum+r;
           n=n/10;
        }
        return sum;
    }
}
