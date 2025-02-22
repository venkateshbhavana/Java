/* create a java application where we have 1 class it contains parametrized contructor and we have a static class , inside it a non static method it contains a local inner class having a non-static method and we have a non static class inside static inner class  it contains a non-static variable and a parameterized constructor invoke all this under main method of separate test class */

import java.util.*;

class A
{
      static Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      A(boolean a)
      {
      System.out.println(a);
      }

static class B
       {
          String m1(int a)
          {
            System.out.println(a);
            class C
             {
               float m2(char a)
                {
                 System.out.println(a);
                  return sc.nextFloat();
                 }
              }
              C o1=new C();
              System.out.println(o1.m2(sc.next().charAt(0)));
            return sc.next();
          }
          
          class D
          {
            Boolean b=sc.nextBoolean();
            D(float d)
            {
              System.out.println(d);
            }
          }

       }

}

class Test
{
   public static void main(String[] args)
    {
      A o2=new A(A.sc.nextBoolean());
      System.out.println(o2.a);
      A.B o3=new A.B(); /* A class lopala class B vundi and B is static so dont create object as A.new B(); */
      System.out.println(o3.m1(A.sc.nextInt()));
      A.B.D o4=o3.new D(A.sc.nextFloat()); /*class A lopala class B lopala class D vundi  here D is non static class so use obj.new D() */
      System.out.println(o4.b);
    }
}
      
          

         
