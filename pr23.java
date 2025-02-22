/* 3) create a java application where we need to satisfy multilevel inheritance. and super at constructor level*/

import java.util.*;
class A{
static Scanner sc=new Scanner(System.in);

A(int a){
System.out.println(a);
}

void m1(String a){
System.out.println(a);

}

}
class B extends A{

B(String a){
super(sc.nextInt());
System.out.println(a);
}


}

class C extends B{

C(){
super(sc.next());
}

public static void main(String[] args){
C o=new C();
o.m1(sc.next());
}
}