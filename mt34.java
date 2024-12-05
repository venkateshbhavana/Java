/* 4. Create a java application where we have one class which contains one static variable, non-static variable, non-static method and static method with parameter and return type, default constructor,single parameterized constructor then invoke all the properties under main method by using single statement and by providing dynamic inputs. */


import java.util.*;

class A
{

     static Scanner sc=new Scanner(System.in);
     static int a=sc.nextInt();
     String b=sc.next();

    A()
    {
      System.out.println("Default");
    }

    A(long a)
    {
      System.out.println(a);
    }

    static boolean m1(long a)
     {
        System.out.println(a);
        return sc.nextBoolean();
     }
    long m2(boolean a)
     {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        return sc.nextLong();

     }

  public static void main(String[] args)
  {
      A o=new A(new A().m2(m1(sc.nextLong())));
   }

}
