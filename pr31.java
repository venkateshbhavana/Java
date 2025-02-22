/* 1) create a java application where we have one class it contains a static method m1 having parameter as int and it is going to return String and we have another static method m2 having parameter as String and it is going to return int value we have a double parameterized contractor having parameters as m1 and m2 methods return values, we have a object parameterized constrictor. Invoke all of them under main method in a single line calling. */

import java.util.*;
class A{
static Scanner sc=new Scanner(System.in);

static String m1(int a){
System.out.println(a);
return sc.next();
}

static int m2(String a){
System.out.println(a);
return sc.nextInt();
}

A(String a,int b){
System.out.println(a+"   "+b);
}

A(A obj){
System.out.println(obj);
}

public static void main(String[] args){


A o=new A(new A(m1(sc.nextInt()),m2(sc.next())));

}
}