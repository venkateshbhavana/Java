import java.util.*;
public class ch14 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            alpha('a','z');
        }
        else{
        alpha('A','Z');
        }
    }
    static void alpha(char ch1, char ch2)
    {
        if(ch1>ch2)
        {
            return;
        }
        System.out.print(ch1+" ");
        alpha((char)(ch1+1),ch2);
    }
}
