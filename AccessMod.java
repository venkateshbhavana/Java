package q;
import java.util.*;

public class AccessMod
{
      public static Scanner sc=new Scanner(System.in);

      private boolean a=sc.nextBoolean();
      int b=sc.nextInt();
      protected String m1(float a)
      {
          System.out.println(a);
          return sc.next();
      }
      public String m1(float a)
      {
          System.out.println(a);
          return sc.next();
      }
    void m2()
     {
         System.out.println(a); //private variable access only within class.
     }
}

class SubAccess extends AccessMod
{
     
 


}
