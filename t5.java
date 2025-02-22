import java.util.*;

class A extends Thread
{
    static Scanner sc=new Scanner(System.in);
    public void run()
    {
        for(int i=10;i<=20;i++)
        {
          System.out.println(i);
        }
    }
}
class B extends Thread
{
    
   public void run()
    {
        for(char i='a';i<='z';i++)
        {
          System.out.println(i);
        }
    }


   public static void main(String[] args) throws Exception
   {
      A t1=new A();
      B t2=new B();
      t1.start();
      t1.join(); /*here if we use this interruptedException raises because only t1 thread executes  remaining main and t2 threads are st, main thread(helping thread ) goes into waiting state ,inside main method only all threads works or invoked if t2 try to invoke but main thread in waiting state unable to invoke so interrupted exception raises. so to handle these exception use throws keyword at method level in which method exception raises. */
      t2.start();
      System.out.println("Done");
   }
}
 