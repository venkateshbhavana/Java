/* 2.Create a java application where we have two interfaces with individual abstract and defined method with parameter and return type, one abstract class which contains single parameterized constructor, one abstract and defined method with parameter and return type then inherit all these at a time in to one concrete class provide functionality for abstract methods then invoke all the properties under main method by providing dynamic inputs. */


import java.util.*;

interface A
{
    static Scanner sc=new Scanner(System.in);
     int m1(String a);
     static float m2(long a)
     {
        System.out.println(a);
        return sc.nextFloat();
     }
}

interface B
{
   
     int m3(boolean a);
     static String m4(long a)
     {
        System.out.println(a);
        return A.sc.next();
     }
}

abstract class C
{
    C(boolean a)
    {
      System.out.println(a);
    }
     
    abstract long m5(boolean a);
     static char m6(float a)
     {
        System.out.println(a);
        return A.sc.next().charAt(0);
     }
}

class Test extends C implements A,B
{
    Test()
    {
      super(A.sc.nextBoolean());
    }

     public int m1(String a)
     {
        System.out.println(a);
        return A.sc.nextInt();
     }
     public int m3(boolean a)
     {
        System.out.println(a);
        return A.sc.nextInt();
     }

      long m5(boolean a)
     {
        System.out.println(a);
        return A.sc.nextLong();
     }

   public static void main(String[] args)
   {
     Test o1=new Test();
     System.out.println(o1.m1(A.sc.next()));
     System.out.println(A.m2(A.sc.nextLong()));
     System.out.println(o1.m3(A.sc.nextBoolean()));
     System.out.println(B.m4(A.sc.nextLong()));
     System.out.println(o1.m5(A.sc.nextBoolean()));
     System.out.println(o1.m6(A.sc.nextFloat()));
  }
}
