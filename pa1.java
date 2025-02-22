/* create a user defined package which contains class which contains variable, method, constructor then access all these properties under main method of separate class of separate package. */

package p1;
import java.util.*;

public class pa1
{
    public static Scanner sc=new Scanner(System.in);
    public int a=sc.nextInt();
    public String m1(boolean a)
    {
       System.out.println(a);
       return sc.next();
    }

    public pa1()
    {
       System.out.println("Default");
    }
}    
