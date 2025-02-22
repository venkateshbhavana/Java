/* create a java application where we need to satisfy constructor overloading and method overloading within a single class */

/*

import java.util.*;
class q56{

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
q56(boolean a){
System.out.println(a);
}

q56(boolean a,int b){
System.out.println(a+"  "+b);
}

public static void main(String[] args){

q56 o=new q56(sc.nextBoolean());
q56 o1=new q56(sc.nextBoolean(),sc.nextInt());
o.m1(sc.nextInt());
System.out.println(o.m1(sc.nextFloat()));
System.out.println(o.m1(sc.nextFloat(),sc.next().charAt(0)));


}
}

*/

import java.util.*;
class q56{

static Scanner sc=new Scanner(System.in);

void m1(int a){
System.out.println(a);
System.out.println(this.m1(sc.nextFloat()));

}

String m1(float a){
System.out.println(a);
System.out.println(this.m1(sc.nextFloat(),sc.next().charAt(0)));
return sc.next();
}

int m1(float a,char b){
System.out.println(a+"  "+b);
return sc.nextInt();
}
q56(boolean a){
this(sc.nextBoolean(),sc.nextInt());
System.out.println(a);
}

q56(boolean a,int b){
System.out.println(a+"  "+b);
this.m1(sc.nextInt());
}

public static void main(String[] args){

q56 o=new q56(sc.nextBoolean());


}
}