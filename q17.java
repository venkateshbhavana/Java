/*  create a java application where we have one class it contains a non static method m1 having no parameters, returns nothing . static method m2 having no parameters, returns nothing. non static method m3 having parameter string, returns nothing . static method m4 having parameter long, returns nothing. non static method m5 having no parameter, returns double values. static method m6 having no parameter,returns int value. non static method m7 having parameter character, returns byte value. static method m8 having parameter integer,returns float value. then invoke m1 under m2, m2 under m3, m3 under m4, m4 under m5, m5 under m6, m6 under m7,m7 under m8 under main method by providing dynamic inputs. */

import java.util.*;
class q17{
static Scanner sc=new Scanner(System.in);
static q17 obj=new q17();

void m1(){
System.out.println("under m1");
}

static void m2(){
System.out.println("under m2");
obj.m1();
}

void m3(String s){
System.out.println(s);

m2();
}

static void m4(long l){

System.out.println(l);
System.out.println("enter string");
String s=sc.next();
obj.m3(s);
}

double m5(){
System.out.println("enter long");
long l=sc.nextLong();
m4(l);
System.out.println("enter double");
double d=sc.nextDouble();

 return d;
}

static int m6(){
System.out.println(obj.m5());
System.out.println("enter int ");
int i=sc.nextInt();
return i;
}

byte m7(char c){
System.out.println(c);
System.out.println(m6());
System.out.println("enter byte");
byte b=sc.nextByte();
return b;
}

static float m8(int i){
System.out.println(i);
System.out.println("enter char");
char c=sc.next().charAt(2);
System.out.println(obj.m7(c));

System.out.println("enter float");
float f=sc.nextFloat();
return f;
}

public static void main(String[] args){
System.out.println("enter int value");
int i2=sc.nextInt();
System.out.println(m8(i2));

}
}

