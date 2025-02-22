import java.util.*;
public class ch16 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        count(n,0);

        static void count(int n,int c)
        {
            if(n==0)
            {
                System.out.print(c);
                return;
            }


            if((n%10)%2==0){
                c++;
            }
            count(n/10,c);
        }
    }
}
