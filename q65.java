//INTERFACES:-


/*  create a java application  where we have 1 interface which contains 2 abstract methods with parameter and return type then inherit this interface into a concrete class provide functionality for abstract methods then invoke all the methods under main method by providing dynamic inputs. */

import java.util.*;
interface A{
static Scanner sc=new Scanner(System.in);  /* here our choice to mention static or not, if not mention static also in main method error not come because in interfaces all properties  are by default static.  */

 int m1(float a);      // No need to write abstract beside method because in interfaces methods are by default public and abstract.
 String m2(long a);

}

class B implements A{

public  int m1(float a){
System.out.println(a);
return sc.nextInt();
}

public  String m2(long a){   //must and should use public preside method to ovverride interface abstract methods.
System.out.println(a);
return sc.next();
}

public static void main(String[] args){

B o=new B();

System.out.println(o.m1(sc.nextFloat()));
System.out.println(o.m2(sc.nextLong()));

}
}
