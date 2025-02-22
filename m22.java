/* 2.Create a java application where need to satisfy method  overloading, constructor overloading and method overriding using two classes by providing dynamic inputs. */


import java.util.*;

class A{
static Scanner sc=new Scanner(System.in);

void m1(int a)
{
    System.out.println(a);
}

void m1(String a,int b)
{
    System.out.println(a+"    "+b);
}

}
class B extends A{  // using extends only we can override any methods

B(float a)
{
  System.out.println(a);
}

B(boolean a)
{
    this(sc.nextFloat());
    System.out.println(a);
}

void m1(int a)
{
   super.m1(sc.nextInt());
   System.out.println(a);
}


public static void main(String[] args)
{
B o=new B(sc.nextBoolean());

o.m1(sc.nextInt());
o.m1(sc.next(),sc.nextInt());




}
}

