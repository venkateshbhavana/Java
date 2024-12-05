/* 1. Create a java application where we have two interfaces which contain one abstract method and defined method provide implementation for these two interfaces by using lamda expressions then invoke the methods under main method by providing dynamic inputs.
 */


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

class Test
{
    
 
    public static void main(String[] args)
    {
       A o1=(a) -> {
       System.out.println(a);
       return A.sc.nextInt();
       };
      
       B o2=(a) -> {
       System.out.println(a);
       return A.sc.nextInt();
       };
    
     System.out.println(o1.m1(A.sc.next()));
     System.out.println(A.m2(A.sc.nextLong()));
     System.out.println(o2.m3(A.sc.nextBoolean()));
     System.out.println(B.m4(A.sc.nextLong()));
   }

}