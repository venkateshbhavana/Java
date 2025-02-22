/* Create a java application where we have 2 interfaces with individual abstract and defined methods , we have 1 abstract class which contains parameterized constructor 1 abstract and defined method then inherit all these properties at a time into 1 concrete class. provide functionality for abstract methods then invoke all the properties under main method by providing dynamic inputs.*/


import java.util.*;

interface A
{
   Scanner sc=new Scanner(System.in);
   int m1(String a);
   static float m2(int a)
   {
     System.out.println(a);
     return sc.nextFloat();
   }
}

interface B
{
   String m3(int a);
   static int m4(float a)
   {
     System.out.println(a);
     return A.sc.nextInt();
   }
}

abstract class C
{
    C(boolean a)
    {
      System.out.println(a);
    }
   abstract boolean m5(int a);
   static char m6(float a)
   {
     System.out.println(a);
     return A.sc.next().charAt(0);
   }
}

class D extends C implements A,B
{
   D()
   {
      super(sc.nextBoolean());
   }

   public int m1(String a)
   {
     System.out.println(a);
     return sc.nextInt();
   }

   public String m3(int a)
   {
     System.out.println(a);
     return sc.next();
   }
   
    boolean m5(int a)
   {
     System.out.println(a);
     return sc.nextBoolean();
   }

  public static void main(String[] args)
  {
     D o1=new D();
     System.out.println(o1.m1(A.sc.next()));
     System.out.println(A.m2(A.sc.nextInt()));
     System.out.println(o1.m3(A.sc.nextInt()));
     System.out.println(B.m4(A.sc.nextFloat()));
     System.out.println(o1.m5(A.sc.nextInt()));
     System.out.println(o1.m6(A.sc.nextFloat()));
  }
}
