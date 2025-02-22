//UPCASTING:=

/* create java application where we have 1 abstract class which contains 1 parameterized constructor and 1 abstract method and 1 defined method then inherit this abstract class into 3 concrete classes then provide functionality for abstract methods , we have another class like test which contains non-static method display having abstract class name as parameter according to user input we need to invoke respective class methods by using display method. then invoke display method under main method. */

import java.util.*;
abstract class A{
static Scanner sc=new Scanner(System.in);
A(String a){
System.out.println(a);
}

abstract int m1(long a);

boolean m2(String a){
System.out.println(a);
return sc.nextBoolean();
}
}

class B extends A{
B(){
super(sc.next());
}

int m1(long a){
System.out.println(a);
return sc.nextInt();
}

}

class C extends A{

C(){
super(sc.next());
}

int m1(long a){
System.out.println(a);
return sc.nextInt();
}
}

class D extends A{
D(){
super(sc.next());
}

int m1(long a){
System.out.println(a);
return sc.nextInt();
}

}

class Test{

static void display(A obj){
System.out.println(obj.m1(A.sc.nextLong()));
System.out.println(obj.m2(A.sc.next()));
}

public static void main(String[] args){
int option =A.sc.nextInt();

if(option==1){
System.out.println("Class B");
A o1=new B();                      //UPCASTING 
display(o1);
}
else if(option==2){
System.out.println("Class C");
A o2=new C();
display(o2);
}

else if(option==3){
System.out.println("Class D");
A o3=new D();
display(o3);
}
else
{
System.out.println("Invalid Input");
}

}
}