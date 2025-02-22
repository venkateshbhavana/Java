
import java.util.*;
@FunctionalInterface
interface A
{
   static Scanner sc=new Scanner(System.in);
   int m1(long a);
  /* boolean m3(long a);  if we write more than 1 abstarct method in functional interface it will give error if we not mention @FunctionalInterface at start error not come becase it is normal interface. */
  
    static String m2(float a)
    {
       System.out.print(a);
       return sc.next();
     }
}

class Test
{
    public static void main(String[] args)
    {
      A o1=new A()
      {
         public int m1(long a)
         {
           System.out.print(a);
           return sc.nextInt();
         }

         /*public boolean m3(long a)
         {
           System.out.print(a);
           return sc.nextBoolean();
         }
*/
       };
       System.out.print(o1.m1(A.sc.nextLong()));
       System.out.print(A.m2(A.sc.nextFloat()));

    }
}