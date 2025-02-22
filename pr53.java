/* 3.Create a java application where we need to raise three runtime (unchecked) exceptions using single try multiple catch blocks display individual messages in the catch blocks */

import java.util.*;

class E
{
   static Scanner sc=new Scanner(System.in);
public static void main(String[] args)
{
   int a[]={1,2,3};
   String s=null;
   try
   {
     
      System.out.println(5/0);
      System.out.println(s.length());
      System.out.println(a[5]);


    }
     catch(ArithmeticException e)
     {
         System.out.println(e);
     }
     catch(NullPointerException e)
     {
         System.out.println(e);
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
         System.out.println(e);
     }

}
}