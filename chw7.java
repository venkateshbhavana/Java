import java.util.*;
class chw7{
    static int sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if((sum(a)==b)&&(sum(b)==a))
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        
        
    }
}