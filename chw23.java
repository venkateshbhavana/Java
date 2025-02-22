import java.util.Scanner;
class primefib {
    static java.util.Scanner sc=new java.util.Scanner(System.in);
    
    static int pri(int n)
    {
        int count=0;
        for(int i=2; ;i++)
        {
            boolean b=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    b=!b;
                    break;
                }
            }
            if(b)
            {
                count++;
                if(count==n)
                {
                    return i;
                }
            }
        }
    }
    static int fib(int n)
    {
        int a=0,b=1;
        //int s=a;
        for(int i=1;i<n;i++)
        {
           
            int c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        int f=0,k=1,ss=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                f++;
                 if(f%2==1)
                 {
                    //int s=pri(k);
                 System.out.print(pri(k)+" ");
                 ++k;
                 }
                 else
                 {
                    // int s=fib(ss);
                     System.out.print(fib(ss)+" ");
                     ++ss;
                 }
                 
            }
            System.out.println();
        }
    }
}