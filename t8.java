/* create a java application where we need to create 1 user defined thread by using runnable interface then display a to z characters by using run method then invoke run method through start method. */

import java.util.*;

class A implements Runnable
{
      public void run()
      {
         for(char i='a';i<='z';i++)
         {
             System.out.println(i);
         }
      }
   public static void main(String[] args)
   {
       A obj=new A();
       Thread t1=new Thread(obj); // we must pass obj of where run method present to print a to z characters. and we are creating thread class object direct because A class not extend thread class and start method present in thread class so thats why.
       t1.start();
   }
}
    

