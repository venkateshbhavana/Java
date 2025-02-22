import java.util.*;
class chw4{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=1;i<=n;i++)
        {
            if(i==n)
            {
                System.out.print(a);
            }
            int c=a+b;
            a=b;
            b=c;
        }
        
    }
}