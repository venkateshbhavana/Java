                              //ACCESS MODIFIERS.


package p1;
import java.util.*;
public class AM
{
    public static Scanner sc=new Scanner(System.in);
    private int a=sc.nextInt();      //private variable
    protected long m1(String a)      //protected method
    {
        System.out.println(a);
        return sc.nextLong();
    }
    public AM()                        //public contructor
    {
       System.out.println("Default");
    }
     String m2(Boolean a)               //Deafult method
    {
       System.out.println(a);
       return sc.next();
    }
 
     //Acessing above properties in within class
     public void m3()
     {
        System.out.println(a);
        System.out.println(m1(sc.next()));
        new AM();
        System.out.println(m2(sc.nextBoolean()));
     }
}
