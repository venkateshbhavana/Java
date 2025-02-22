/*  Create a java application where we have 1 interface which contains 1 abstract and defined method then inherit this interface into another interface which contains 1 absract method,we have another interface which contains two undefined methods then inherit these 2 interface properties into a concrete class provide functionality for abstract methods and then invoke all the properties under main method by providing dynamic inputs */

import java.util.*;

interface A{

static Scanner sc=new Scanner(System.in);

int m1(float a);

static String m2(int a){
System.out.println(a);
return sc.next();
}

}

interface B extends A{

long m3(boolean a);
}

interface C{

float m4(String a);
boolean m5(float a);

}

class D implements B,C{ // no need to  implement A because B already extends A.

public int m1(float a){
System.out.println(a);
return sc.nextInt();
}

public long m3(boolean a){
System.out.println(a);
return sc.nextLong();
}

public float m4(String a){
System.out.println(a);
return sc.nextFloat();
}

public boolean m5(float a){
System.out.println(a);
return sc.nextBoolean();
}

public static void main(String[] args){
D o=new D();

System.out.println(o.m1(sc.nextFloat()));
System.out.println(A.m2(sc.nextInt()));  /* if you take defined method as static in interface use interface name to invoke defined method if we use default use D class object to invoke. */

System.out.println(o.m3(sc.nextBoolean()));
System.out.println(o.m4(sc.next()));
System.out.println(o.m5(sc.nextFloat()));

}
}
