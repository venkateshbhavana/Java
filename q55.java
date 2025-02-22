/*  a java application where we need to satisfy  method overloading by using 3 methods within a  single class*/
/*
import java.util.*;
class q55{

static Scanner sc=new Scanner(System.in);

void m1(int a){
System.out.println(a);
}

String m1(float a){
System.out.println(a);
return sc.next();
}

int m1(float a,char b){
System.out.println(a+"  "+b);
return sc.nextInt();
}

public static void main(String[] args){

q55 o=new q55();
o.m1(sc.nextInt());
System.out.println(o.m1(sc.nextFloat()));
System.out.println(o.m1(sc.nextFloat(),sc.next().charAt(0)));

}
}

*/

import java.util.*;
class q55{

static Scanner sc=new Scanner(System.in);

void m1(int a){
System.out.println(a);
}

String m1(float a){
System.out.println(a);
this.m1(sc.nextInt());
return sc.next();
}

int m1(float a,char b){
System.out.println(a+"  "+b);
this.m1(sc.nextFloat());
return sc.nextInt();
}

public static void main(String[] args){

q55 o=new q55();

System.out.println(o.m1(sc.nextFloat(),sc.next().charAt(0)));

}
}