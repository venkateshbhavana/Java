import java.util.*;
class chw1
{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=0;
    while(n>0)
    {
        n=n/10;
        c++;
    }
    int sum=0,sum1=0;
    for(int i=1;i<=c;i++)
    {
        int r=n%10;
        n=n/10;
    if(i==1||i==c)
    {
        sum=sum+r;
    }
    else{
        sum1=sum1+r;
    }
    
    }
    if(sum==sum1)
    {
        System.out.print("True");
    }
    else{
        System.out.print("False");
    }
}    
}