
import java.util.*;

class c1{

static Boolean isPrime(int n){
int fc=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
fc++;
}
}
if(fc==2)
{
return true;
}
else
{
return false;
}

}

static int digit(int n){
int p=1,t=n;

while(n>0){
int r=n%10;
p=p*r;
n=n/10;
}
int sum=p+t;
return sum;

}

static int nextPrime(int n)
{
    int next=n+1;
    while(!isPrime(next)){
        next++;
    }
    return next;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

if(isPrime(n))
{
    if(isPrime(digit(n)))
    {
        if(digit(n)==nextPrime(n))
        {
            System.out.println("True");
        }
        else
         {
          System.out.println("False");
         }

    }
    else
    {
        System.out.println("False");
    }

}
else{
    System.out.println("False");
}

}
}



/*
 * import java.util.*;
class Main{
    static int sum(int n)
    {
        int t=n,p=1;
        while(t>0)
        {
            int r=t%10;
            p=p*r;
            t=t/10;
        }
        return n+p;
    }
    static boolean isPrime(int n)
    {
            if(n==1)
            return false;
            
            boolean b=true;
            int sq=(int)Math.sqrt(n);
            for(int j=2;j<=sq;j++)
            {
                if(n%j==0)
                {
                    return false;
                }
            }
            return true;
    }
    static int nextPrime(int n)
    {
        for(int i=n+1;;i++)
        {
            boolean b=true;
            int sq=(int)Math.sqrt(i);
            for(int j=2;j<=sq;j++)
            {
                if(i%j==0)
                {
                    b=!b;
                    break;
                }
            }
            if(b&&i!=1)
            {
                
                return i;
                
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n))
        {
            if(isPrime(sum(n)))
            {
                if(nextPrime(n)==sum(n))
                {
                    System.out.print("True");
                }
                else{
                    System.out.print("False");
                }
            }
            else{
                System.out.print("False");
            }
        }
        else{
            System.out.print("False");
        }
        
        
    }
}
 */