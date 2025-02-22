/* 1.Create a java application where we have one abstract class which contains double parameterized constructor, one abstract and defined method with parameter and return type then inherit this class into another abstract class which contains single parameterized constructor, two abstrat methods with parameter and return type then inherit this class into concrete class then provide functionality for all the abstract methods then invoke all the methods by providing dynamic inputs. */


import java.util.*;

abstract class A{
static Scanner sc=new Scanner(System.in);

 A(int a,float b)
  {
      System.out.println(a+"   "+b);
  }

abstract String m1(int a);

   float m2(long a)
   {
      System.out.println(a);
      return sc.nextFloat();
   }

}

abstract class B extends A{

B(boolean a)
{
   super(sc.nextInt(),sc.nextFloat());
   System.out.println(a);
}

abstract boolean m3(int a);
abstract String m4(float a);

}

class C extends B{

C()
{
   super(sc.nextBoolean());
}

String m1(int a)
{
    System.out.println(a);
    return sc.next();
}

boolean m3(int a)
{
   System.out.println(a);
   return sc.nextBoolean();
}

String m4(float a)
{
   System.out.println(a);
   return sc.next();
}

public static void main(String[] args)
{

C o=new C();

System.out.println(o.m1(sc.nextInt())); 
System.out.println(o.m2(sc.nextLong()));
System.out.println(o.m3(sc.nextInt()));
System.out.println(o.m4(sc.nextFloat()));

}
}



