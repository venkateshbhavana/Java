/*  3) Create a java application where we have one class A it contains a static method m1 and a default constructor and we need to inherit all these properties from class A to class B. class B contains static method m2 and a double parameter constructor and a non-static method and we have another class C inherit all these properties from class A to class C it contains a static method invoke all the properties in to main method of separate class test by providing dynamic inputs.*/

import java.util.*;
class A{
static Scanner sc=new Scanner(System.in);

A(){
System.out.println("Default");
}

static void m1(int a){
System.out.println(a);
}

}

class B extends A{

static void m2(String a){

System.out.println(a);
}

B(int a,double b){
super();
System.out.println(a+"   "+b);
}

 void m3(boolean a){
System.out.println(a);
}

}
class C extends A{
static void m4(String a){

System.out.println(a);
}
}
class test{
public static void main(String[] args){


A o1=new A();
o1.m1(A.sc.nextInt());

B o2=new B(A.sc.nextInt(),A.sc.nextDouble());
o2.m2(A.sc.next());
o2.m3(A.sc.nextBoolean());
C o3=new C();
o3.m4(A.sc.next());

}
}


