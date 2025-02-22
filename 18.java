/* create a java application where we have 1 interface which contains 1 abstract method, inside this interface we have another interface which contains 1 abstract method then inherit these two interfaces at a time into 1 concrete class, provide functionality for abstract methods and then invoke all the methods under main method by provide dynamic inputs */

import java.util.*;
interface A
{
static Scanner sc=new Scanner(System.in);
   int m1(boolean a);
   
   interface B
   {
      int m2(String a);
   }
}

class C implements A,A.B  // for implemet inner B we use  A lopala B vundi kabatti A.B use chayali.
{
    public int m1(boolean a)
         {
         System.out.println(a);
         return A.sc.nextInt();
         }

    public int m2(String a)
    {
       System.out.println(a);
       return sc.nextInt();
    }

 public static void main(String[] args){
    C o1=new C();
    System.out.println(o1.m1(sc.nextBoolean()));
    System.out.println(o1.m2(sc.next()));

 }

}
