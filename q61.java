/* create a java application where we have an abstract class which contains 2 abstract methods and 1 defined method having parameter and return type then inherit this class into another abstract class which contains single parametrized constructor 1 abstract and defined method with parameter and return type then inherit this class into concrete class provide functionality for abstract methods and then invoke all the methods under main method by providing dynamic inputs  */


// correct code there in abstract2.java file.


import java.util.*;
abstract class q61a{
static Scanner sc=new Scanner(System.in);

abstract int m1(String a);
abstract boolean m2(float a);

 int m3(char a){
System.out.println(a);
return sc.nextInt();
}

}

abstract class q61b extends q61a{

q61b(int a){
System.out.println(a);
}

abstract String m4(boolean a);

float m5(String a){
System.out.println(a);
return sc.nextFloat();
}

}

class q61c extends q61b{

q61c(long a){
super(sc.nextInt());
System.out.println(a);
}
abstract String m4(boolean a){
System.out.println(a);
return sc.next();
}

abstract String m4(boolean a){
System.out.println(a);
return sc.next();
}

public static void main(String[]  args){


q59b o=new q59b();
System.out.println(o.m1(sc.next()));
System.out.println(o.m2(sc.nextFloat()));
}
}