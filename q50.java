/*  create a java application where we need to satisfy super keyword at all three levels */

import java.util.*;

class q50a{
static Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
q50a(int a){
System.out.println(a);
}
String m1(boolean a){
System.out.println(a);

return sc.next();
}
}

class q50b extends q50a{

void m1(char a){

System.out.println(super.m1(sc.nextBoolean()));
System.out.println(a);

System.out.println(super.a);
}
q50b(String a){
super(sc.nextInt());
System.out.println(a);
}


public static void main(String[] args){
q50b o=new q50b(sc.next());
//q50b o1=new q50b();
o.m1(sc.next().charAt(0));

}
}