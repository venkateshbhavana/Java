 import java.util.*;
 class chw24 {

    static int fact(int r)
    {
        int fact=1;
        for(int i=r;i>=1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int sum=0;
        while(t>0)
        {
            int r=t%10;
            sum=sum+fact(r);
            t=t/10;
        }
        if(sum==n)
        {
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a Strong number");
        }
    }
}
