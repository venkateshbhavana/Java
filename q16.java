/* Q.16)create a java application where we have one class it contains non static method m1 having parameter String , returns nothing. static method m2 having no parameter, returns long values.  non static method m3 having no parameter when returns nothing. static method m4 having parameter double , returns short value than invoke m1 under m2 , m2 under m3,  m3 under m4 , m4 under main method.  by providing dynamic inputs. */

import java.util.*;
class q16{

static q16 obj1=new q16();// if we taken obj as a global variable we just take 1 obj is enough. if we try to write in methods we can use no.of times we want

static Scanner sc=new Scanner(System.in);

void m1(String s){


System.out.println(s);
}

static long m2(){

System.out.println("eneter String ");
String s=sc.next();
obj1.m1(s);

System.out.println("under m2");
System.out.println("eneter long value");
long l=sc.nextLong();
return l;

}

void m3(){
System.out.println("under m3");

System.out.println(m2());

}

static short m4(double d){


System.out.println(d);

obj1.m3();
System.out.println("eneter short value");
short sh=sc.nextShort();
 return sh;
}


public static void main(String[] args){
System.out.println("enter double value" );
double d=sc.nextDouble();

System.out.println(m4(d));

}

}

