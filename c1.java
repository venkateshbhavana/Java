
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