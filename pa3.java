/* create a java application where we need to create 1 package which contains 1 interface it has 1 abstract and defined methods. we have 1 abstract class which contains parameterised contructor ,1 abstract and defined method, we have 1 sub package which contains 1 interface it  contains 1 abstract and defined method , we have 1 concrete class which contains parametrised constructor and 1 non static method then access all these properties under separate class of separate package provide functionality for all the abstract methods and then invoke all the properties under main method by providing dynamic inputs. */

package p1;

import java.util.*;

interface pa3
{
   public static Scanner sc=new Scanner(System.in);
    int m1(String a);
    String m2(int a)
    {
       System.out.println(a);
       return sc.next();
    }
}

abstract class B
{

     public B(Boolean a)
    {
        System.out.println(a);
    }

    public abstract int m1(float a);
    public long m2(float a)
    {
       System.out.println(a);
       return pa3.sc.nextLong();
    }

}
