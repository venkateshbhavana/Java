/* create a java application where we need to handle null pointer exception even if we handle the exception or not we need to display the message like close.*/

import java.util.*;
class q71
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String n=null;
       
      try{
       System.out.println(n.length());  //raising exception
       }
      catch(NullPointerException e){
       System.out.println(e); 
       System.out.println(n); // handling exception code .
      }
     finally{  /* if you not write catch block for handle exception only final block will execute and raises the exception at run time*/
      System.out.println("Close");
     }

        System.out.println("Done"); /*if we not write catch block after try block codes will not execute if exception raises. */

    }
}