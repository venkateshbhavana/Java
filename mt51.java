/*1. Create a java application where we have one interface , it contains two abstract methods and two defined
methods like static and non-static with parameters and return type, for this interface we have two
implementation classes , we have class like Main which contains non-static method like display and it will return
interface object , then we need to invoke display method under main of Test class and invoke the methods of
interfaces with respect to particular implementation class reference.
*/
import java.util.*;
interface A
{
    Scanner sc=new Scanner(System.in);
    int m1(float a);
    String m2(int a);
    
    static boolean m3(long a)
    {
        System.out.println(a);
        return sc.nextBoolean();
    }
    default char m4(short a)
    {
        System.out.println(a);
        return sc.next().charAt(0);
    }
    
}
class main implements A{
    public int m1(float a)
    {
        System.out.println(a);
        return A.sc.nextInt();
    }
    public String m2(int a)
    {
        System.out.println(a);
        return A.sc.next();
    }
    A display()
    {
        return new main();
    }
}
class test implements A
{
    public int m1(float a)
    {
        System.out.println(a);
        return A.sc.nextInt();
    }
    public String m2(int a)
    {
        System.out.println(a);
        return A.sc.next();
    }
    
    public static void main(String args[])
    {
        main o=new main();
        A o1=o.display();
        System.out.println(o1.m1(A.sc.nextFloat()));
        System.out.println(o1.m2(A.sc.nextInt()));
        System.out.println(A.m3(A.sc.nextLong()));
        System.out.println(o1.m4(A.sc.nextShort()));
    }
}