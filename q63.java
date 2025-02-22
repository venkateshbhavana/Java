/* create a java application where we have 1 concrete class which contains double parameterized constructor and 1 method with parameter and return type then inherit this class into abstract class which contains 1 abstract and defined methods then inherit this class into concrete class provide function for abstract methods then invoke all the methods under main method by providing dynamic inputs*/

import java.util.*;
class q63a{
static Scanner sc=new Scanner(System.in);

q63a(int a, double b){
System.out.println(a+"   "+b);
}

int m1(String a){
System.out.println(a);
return sc.nextInt();
}
}

abstract class q63b extends q63a{
q63b(){
super(sc.nextInt(),sc.nextDouble());

}


abstract float m2(long a);

int m3(float a){
System.out.println(a);
return sc.nextInt();
}

}

class q63c extends q63b{
/*  internal proces done */
q63c()
{
super();
}


float m2(long a){
System.out.println(a);
return sc.nextFloat();
}

public static void main(String[] args){
q63c o=new q63c();  

 /* if we provid parameters in this constructor it calls parameter constructor in q63c class again we want write function for this constructor and invoke base class constructor. so make process easy we craete defalut constructor, so it automatically calls default constructor in q63c and again calls super() which is in q63b q63b() constructor call super(parametrs) which is in base class q63a */

System.out.println(o.m1(sc.next()));
System.out.println(o.m2(sc.nextLong()));
System.out.println(o.m3(sc.nextFloat()));

}
}

