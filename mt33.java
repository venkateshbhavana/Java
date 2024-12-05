/* 3. Create a java application where we have one class which contains two private fields without values, provide user defined values by using constructor, provide setter and getter methods then update and retrieve the values with respect through user class. */


import java.util.*;

class A
{
   static Scanner sc=new Scanner(System.in);
    private int id;
    private String pas;

   A(int id,String pas)
   {
      this.id=id;
      this.pas=pas;
   }

   void s1(int id)
   {
     this.id=id;
     
   }

   void s2(String pas)
   {
     this.pas=pas;
   }
   int g1()
   {
      return id;
   }
   String g2()
   {
     return pas;
   }

}

class Test 
{
     public static void main(String[] args)
     {
       A o=new A(A.sc.nextInt(),A.sc.next());
       o.s1(A.sc.nextInt());
       o.s2(A.sc.next());
      System.out.println("Updated Details: ");
      System.out.println(o.g1());
      System.out.println(o.g2());
   }
}