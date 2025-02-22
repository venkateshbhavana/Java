/* create a java application where we have 3 custom defined threads 1st thread has to display 1 to 10 numbers , 2nd thread has to display 11 to 20 numbers, 3rd thread has to display 21 to 30 after 1st thread displaying 1 to 10, 2nd thread has to start displaying from 11 to 20 then start 3rd thread then suspend it and it has to start displaying numbers when 2nd thread completes display 15*/

import java.util.*;

class A extends Thread
{
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
   for(int i=11;i<=20;i++)
   {
      System.out.println(i);
      if(i==15)
      {
        C.t3.resume();
      }
   }
  }
}

class C extends Thread
{r
  static C t3; // here we mentioned static because while accessing no need to create object.
  public void run()
  {
   for(int i=21;i<=30;i++)
   {
      System.out.println(i);
   }
  }

   public static void main(String[] args) throws Exception
   {
     A t1=new A();
     B t2=new B();
      t3=new C();  // C is a local variable declare it gobally to avoid cannot find symboll error at C.t3.resume() line of code.
     t1.start();
     t1.join();  // completely 1st t1 thread executes.after that t2,t3 threads starts t3 suspended it goes to waiting state until t2 thread executes 1 to 15 numbers after that t2 and t3 threads executes parallely. 
     t2.start();
     t3.start();
     t3.suspend();
      //System.out.println("Done");

   }
   
}