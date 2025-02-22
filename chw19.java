import java.util.*;
public class chw19 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=0;
        //int sum=0;
        System.out.print(sum(s,i));
    }
    static int sum(String s,int i)
    {
        if(i==s.length())
        {
            return 0;
        }

        char ch=s.charAt(i);
        if(ch>='0' && ch<='9')
        {
            
            return (ch-48)+sum(s,i+1);
        }
        else
        {
        return 0+sum(s,i+1);
        }

    }
}
