/* 1.Create a java application where we need to handle the Arithmetic Exception, if this exception is raised and handled then you need to handle the NumberFormatException by providing dynamic inputs*/

import java.util.*;

class A
{
    static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
    
    try
    {
       int n=sc.nextInt();
       System.out.println(n/0);
    }
    catch(ArithmeticException e)
    {
         System.out.println(e);
         try
         {

              String s=sc.next();
              System.out.println(Integer.parseInt(s));
         }
         catch(NumberFormatException e1)
         {
                System.out.println(e1);
         }
     }
  }
}


   