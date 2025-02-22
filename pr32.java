/* 2)Create a java application where we need to method overloading and constructor overloading and method overriding and this and supper at all levels in a single program */

import java.util.*;
class A{
static Scanner sc=new Scanner(System.in);
String a=sc.next();

void m1(int a){
System.out.println(a);
}
void m1(boolean a){
System.out.println(this.a);
}

A(boolean a){
System.out.println(a);
}

}

class B extends A{

B(){
this(sc.next());
}
B(String a){
super(sc.nextBoolean());
System.out.println(a);
}



void m1(int a){
super.m1(sc.nextBoolean());
System.out.println(a);
}

void m2(boolean a){
this.m1(sc.nextInt());
System.out.println(super.a);
}

public static void main(String[] args){
B o=new B();
o.m2(sc.nextBoolean());

}
}