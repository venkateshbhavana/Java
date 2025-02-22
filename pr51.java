/* 1.Create a java app where we have one interface it contains 1 abstract and defined methods each. Inside this interface we have one more interface having 1 abstract and static methods each. Provide Implementation for both these interfaces using lambda expression and invoke all the properties under main method of separate class like Test. */
import java.util.*;

interface A
{
     Scanner sc=new Scanner(System.in);
     int m1(String a);
     static Boolean m2(float a)
     {
         System.out.println(a);
         return sc.nextBoolean();
     }
     interface B
     {
        String m3(float a);
        static int m4(float a)
        {
          System.out.println(a);
          return sc.nextInt();
        }
     }
       
}

class Test
{
   public static void main(String[] args)
   {
        A o1=(a)->
        {
          System.out.println(a);
          return A.sc.nextInt();
        };
       A.B o2=(a)->
        {
          System.out.println(a);
          return A.sc.next();
        };
      System.out.println(o1.m1(A.sc.next()));
      System.out.println(o2.m3(A.sc.nextFloat()));
      System.out.println(A.m2(A.sc.nextFloat()));
      System.out.println(A.B.m4(A.sc.nextFloat()));

   }
}