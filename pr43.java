/* create a java application where we need to satisfy method overloading and constructor overloading and method overriding */

import java.util.*;
class A
{
   static Scanner sc=new Scanner(System.in);
   

   int m1(String a)
   {
     System.out.println(a);
     return sc.nextInt();
   }
   void m1(boolean a)
   {
      this.m1(sc.next());
      System.out.println(a);
   }

}

class B extends A
{
   B()
   {
     System.out.println("Default");
   }
   int m1(String a)
   {
     System.out.println(a);
     return sc.nextInt();
   }

  public static void main(String[] args)
  {
    B o1=new B();
    System.out.println(o1.m1(sc.next()));
    o1.m1(sc.nextBoolean());
  }
}
