/*1) Create a java application where we have one base class it contains one static method and a static variable and non static variable and a parameterized constructor. we have a derived class it contains a static method and non static method and a non static variable invoke all these under main method. */

import java.util.*;
class q1a{
static Scanner sc=new Scanner(System.in);

static int a=sc.nextInt();
 String b=sc.next();


static void m1(float a){

System.out.println(a);
}

q1a(boolean a){
System.out.println(a);
}

}

class q1b extends q1a{
int c=sc.nextInt();
q1b(){
super(sc.nextBoolean());
}



static String m2(float a){

System.out.println(a);

return sc.next();
}

 float m3(boolean a){

System.out.println(a);

return sc.nextFloat();
}


public static void main(String[] args){
q1b o1=new q1b();
System.out.println(a);
System.out.println(o1.b);
System.out.println(o1.c);
m1(sc.nextFloat());
System.out.println(m2(sc.nextFloat()));
System.out.println(o1.m3(sc.nextBoolean()));

}
}
