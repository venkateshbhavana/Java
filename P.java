/*create java application where we have 1 package which contains 1 concrete class with parameterized constructor and 1 defined method, 1 interface which contains 1 defined and undefined method, we have 1 sub package which contains 1 abstract class with 1 parametrized constructor,1 abstract and defined method,1 interface which contains 2 abstract methods , we have 1 sub-sub package which contains 1 interface with 2 abstract methods , 1 more interface with 2 defined methods , 1 concrete class with 1 parametrized constructor and 1 method then access all these features into the class of separate package  like main package and sub package features  by using import keyword and sub-sub package features by using fully qualified name approach.*/



package p.p1.p2;
import p.J;
public class P
{
    public P(long a)
    {
        System.out.println(a);
     }
    public short m12(float a)
   {
      System.out.println(a);
      return J.sc.nextShort();
   }
}
