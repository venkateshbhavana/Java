import java.util.*;

class A
{
    static Scanner sc=new Scanner(System.in);
    int m1(long a)
    {
       System.out.println(a);
       return sc.nextInt();
    }
    boolean m2(float a)
    {
       System.out.println(a);
       return sc.nextBoolean();
    }
}
class B extends Thread
{
    
    public void run()
    {
        A o=new A();
        System.out.println(o.m1(A.sc.nextLong()));
        System.out.println(o.m2(A.sc.nextFloat()));
    }

   public static void main(String[] args)
   {
      B t1=new B();
      t1.start();
   }
}
 