/* create a java application where we have 2 interfaces with individual abstract and defined methods,we have 1 abstract class which contains parametrized constructor ,1 abstract and defined method then inherit all these properties at a time into 1 concrete class provide functionality for abstract methods then invoke all methods under main method by providing dynamic inputs.

note:- inherit 2 interfaces , abstract class into single concrete class */

import java.util.*;
interface A{

 Scanner sc=new Scanner(System.in);

int m1(float a);

static String m2(int a){
System.out.println(a);
return sc.next();
}
}

interface B{

long m3(boolean a);

static boolean m4(float a){
System.out.println(a);
return A.sc.nextBoolean();
}

}

abstract class C{

C(Boolean a){
System.out.println(a);
}

abstract float m5(String a);

static char m6(int a){
System.out.println(a);
return D.sc.next().charAt(0);
}

}

class D extends C implements A,B{ 

 /* abstract class cannot be instantiated so we use D extends C(single level inheritance-at a time 1 class only extends) and then for interface to class we use C implements A,B(multiple inheritance-no.of interfaces we can implements).  */


D(){
super(sc.nextBoolean());
}

public int m1(float a){
System.out.println(a);
return sc.nextInt();
}

public long m3(boolean a){
System.out.println(a);
return sc.nextLong();
}

public float m5(String a){
System.out.println(a);
return sc.nextFloat();
}

public static void main(String[] args){
D o=new D();
System.out.println(o.m1(sc.nextFloat()));
System.out.println(A.m2(sc.nextInt()));
System.out.println(o.m3(sc.nextBoolean()));
System.out.println(B.m4(sc.nextFloat()));
System.out.println(o.m5(sc.next()));
System.out.println(C.m6(sc.nextInt()));

}
}

