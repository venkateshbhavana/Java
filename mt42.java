/* 2.Create a java application where we have one abstract class having one abstract method and one defined method having parameter and return type inside this abstract class we have one more class having 2 non static methods. We have one separate interface which contains 1 abstract methods, one static method, then invoke all the properties by providing dynamic inputs in a separate class Test without using extends keyword for abstract class and implements/new keyword for interface.*/

import java.util.*;
 
abstract class A
{
    static Scanner sc=new Scanner(System.in);
    
    abstract int m1(long a);
     int m2(float a)
    {
          System.out.println(a);
          return sc.nextInt();
    }

    class B
    {
         float m3(String a)
         {
           System.out.println(a);
           return A.sc.nextFloat();
         }
         boolean m4(float a)
        {
          System.out.println(a);
          return A.sc.nextBoolean();
        }
    }
}

interface C
{
       int m5(String a);
     static int m6(float a)
    {
         System.out.println(a);
         return A.sc.nextInt();
    }  
}

class Test
{
  static C o2=(a) ->
  {
         System.out.println(a);
         return A.sc.nextInt();
  };

 public static void main(String[] args)
 {

   A o1=new A()
   {
    int m1(long a)
    {
         System.out.println(a);
         return A.sc.nextInt();
    }
   };

   A.B o3=o1.new B();  // dont write as o1.B o3=... because we are taking reference in these cases. so for left side just class name enough as A.B o1=....
     System.out.println(o1.m1(A.sc.nextLong()));
     System.out.println(o1.m2(A.sc.nextFloat()));
     System.out.println(o3.m3(A.sc.next()));
     System.out.println(o3.m4(A.sc.nextFloat()));
     System.out.println(o2.m5(A.sc.next()));
     System.out.println(C.m6(A.sc.nextFloat()));
 }

  
}       
   