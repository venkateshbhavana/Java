//
import java.util.*;
class chw28 {
    static boolean fib(int n)
    {
        int a=0,b=1;
        while(a<n)
        {
          int c=a+b;
          a=b;
          b=c;
        }
        if(a==n)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    static boolean p(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        int p=2,np=2,nf=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*n;j++)
            {
                if(j<=i)
                {
                System.out.printf("%03d ",a); 
                      int c=a+b;
                      a=b;
                      b=c;
                    }
                   
                else if(j>=2*n-i+1)
                {
                    while(fib(nf))
                    {
                        nf++;
                    }
                    System.out.printf("%03d ",nf++);
                }
                else
                {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*n;j++)
            {
                if(j<=n-i+1)
                {
                    while(!p(p))
                    {
                        p++;
                    }
                    System.out.printf("%03d ",p++);
                }
                else if(j>=n+i)
                {
                    while(p(np))
                    {
                        np++;
                    }
                    System.out.printf("%03d ",np++);
                }
                else
                {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
