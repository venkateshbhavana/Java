import java.util.*;

class A extends Thread
{
    static Scanner sc=new Scanner(System.in);
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
          System.out.println(i);
        }
    }
}
class B extends Thread
{
    
   public void run()
    {
        for(int i=20;i<=30;i++)
        {
          System.out.println(i);
        }
    }


   public static void main(String[] args)
   {
      A t1=new A();
      B t2=new B();
      t1.start();
      t2.start();
      System.out.println("Done");
   }
}
 