/* 3) Create a java application where we need to create a abstract class it contains an abstract method and a parameterized contractor. we have an abstract class it contains a abstract method distract and a defined Method we have a concrete class it inherits the properties from bouts interface and abstract class and override all the abstract methods in the concrete class and invoke them under main method.*/

//above question is not fit to below answer.

import java.util.*;
abstract class A{
static Scanner sc=new Scanner(System.in);

abstract String m1(int a);

A(float a){
System.out.println(a);
}

}

class B extends A{

B(){
super(sc.nextFloat());
}

String m1(int a){
System.out.println(a);

return sc.next();
}

public static void main(String[] args){

B o=new B();
System.out.println(o.m1(sc.nextInt()));

}
}
