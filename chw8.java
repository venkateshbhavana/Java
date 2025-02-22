import java.util.*;
class chw8
{
    static int reve(int n)
    {
        int rev1=0;
        while(n>0)
        {
            int r=n%10;
            rev1=rev1*10+r;
            n=n/10;
        }
        return rev1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=Math.abs(n);
        if(n==0)
        {
            System.out.print("Invalid Input.");
        }
        else
        {
        int c=0,t=n,rev=0;
        while(t>0)
        {
            t=t/10;
            c++;
        }
        int t1=n*n;
        for(int i=1;i<=c;i++)
        {
            int r=t1%10;
            rev=rev*10+r;
            t1=t1/10;
        }
       
        
        if(n==reve(rev))
        {
            System.out.print("Automorphic Number");
        }
        else
        {
            System.out.print("Not an Automorphic Number");
        }
        }
    }
}