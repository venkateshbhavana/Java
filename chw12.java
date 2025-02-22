import java.util.*;
public class chw12 {
    static int sum(int n)
    {
        if(n==1)
        {
            System.out.print(n);
           return 1;
        }
        else{
        int ps=sum(n-1);
         System.out.print("+"+n);
        return n+ps;
        }

    }
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("="+sum(n));
    }
}
