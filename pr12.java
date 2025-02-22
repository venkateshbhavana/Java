/* 2) Create a java application where we need to satisfy this at constructor level and variable level, super at constructor level in a single program.  */

import java.util.*;
class q2a{
static Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

void m1(int a){

System.out.println(this.a);
}

q2a(){
System.out.println("Default");
}

}

class q2b extends q2a{

void m2(float a){

System.out.println(super.a);
}
q2b(boolean a){
super();
System.out.println(a);
}

q2b(int a){
this(sc.nextBoolean());
System.out.println(a);
}

public static void main(String[] args){
q2b o=new q2b(sc.nextInt());
o.m1(sc.nextInt());

}
}