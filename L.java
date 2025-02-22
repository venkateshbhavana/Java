/*create java application where we have 1 package which contains 1 concrete class with parameterized constructor and 1 defined method, 1 interface which contains 1 defined and undefined method, we have 1 sub package which contains 1 abstract class with 1 parametrized constructor,1 abstract and defined method,1 interface which contains 2 abstract methods , we have 1 sub-sub package which contains 1 interface with 2 abstract methods , 1 more interface with 2 defined methods , 1 concrete class with 1 parametrized constructor and 1 method then access all these features into the class of separate package  like main package and sub package features  by using import keyword and sub-sub package features by using fully qualified name approach.*/


package p.p1;
import p.J; // importing J class because we are using scanner class for giving 
public abstract class L
{
    public L(Boolean a)
    {
        
        System.out.println(a);
    }

    public abstract char m4(long a);
    public int m5(float a)
   {
      System.out.println(a);
      return J.sc.nextInt();
   }

}
