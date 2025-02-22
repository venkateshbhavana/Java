import java.util.*;
class chw18{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sof(n));

    }
    static int sof(int n)
        {
            if(n==0)
            {
                return 1;
            }
            return fact(n)+sof(n-1);
        }
    static int fact(int n)
        {
            if(n==0)
            {
                return 1;
            }
            return n*fact(n-1);
        }
}