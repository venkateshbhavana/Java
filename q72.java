/* write a java application where we need to handle Arithmetic Exception, Input Mismatch Exception, Array Index Out Exception by using multiple methods */

import java.util.*;
class E
{
static Scanner sc=new Scanner(System.in);


    int m1(int a)
   {
     
      try
      {
       System.out.println(a);
      }
      catch(InputMismatchException ex)
      {
       System.out.println(ex);
      }
     return sc.nextInt();
   }

    float m2(int n)
   {

      try
      {
       System.out.println(n/0);
      }
      catch(ArithmeticException e)
      {
       System.out.println(e);
      }
     return sc.nextFloat();
   }

    boolean m3(int a[])
   {
      System.out.println(a);
      try
      {
       System.out.println(a[4]);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println(e);
      }
     return sc.nextBoolean();
   }

  public static void main(String ar[])
  {
     int n=10;
     int a[]={1,2,3,4};
       E o=new E();
        System.out.println(o.m1(sc.nextInt()));
        System.out.println(o.m2(n));
        System.out.println(o.m3(a));

  
  }
}