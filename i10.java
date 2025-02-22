/*LAMBDA EXPRESSIONS -  it is only possible for to override 1 abstract method which is present in only interfaces.*/


import java.util.*;
interface A
{
    Scanner sc=new Scanner(System.in);

    int m1(long a,boolean b);

    default String m2(int a)
    {
       System.out.println(a);
       return sc.next();
    }

}

class B
{
    public static void main(String[] args)
    {
       A obj=(a,b)->
       {
         System.out.println(a+"  "+b);
         return A.sc.nextInt();
       };
      
       System.out.println(obj.m1(A.sc.nextLong(),A.sc.nextBoolean()));
       System.out.println(obj.m2(A.sc.nextInt()));
    }
}

      