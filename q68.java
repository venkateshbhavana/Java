/* create a java application where we have 1 interface which contains 2 abstract methods and 1 defined method with parameter and return type then inherit this interface into 3 clases then provide functionality for abstract methods , we have 1 class like test which contains a non-static method having interface name as parameter then according to userinput we need to invoke respective class methods through non-static method then invoke that method under main method. */

import java.util.*;
interface A{
Scanner sc=new Scanner(System.in);

int m1(float a);
long m2(boolean a);

static String m3(int a){
System.out.println(a);
return sc.next();
}

}

class B implements A{

public int m1(float a){
System.out.println(a);
return sc.nextInt();
}

public long m2(boolean a){
System.out.println(a);
return sc.nextLong();
}

}

class C implements A{

public int m1(float a){
System.out.println(a);
return sc.nextInt();
}

public long m2(boolean a){
System.out.println(a);
return sc.nextLong();
}

}

class D implements A{

public int m1(float a){
System.out.println(a);
return sc.nextInt();
}

public long m2(boolean a){
System.out.println(a);
return sc.nextLong();
}

void m1(){
System.out.println("M1");
}

}

class Test{

void t(A o){
System.out.println(o.m1(A.sc.nextFloat()));
System.out.println(o.m2(A.sc.nextBoolean()));

System.out.println(A.m3(A.sc.nextInt()));
}

public static void main(String[] args){
int op=A.sc.nextInt();
Test t=new Test();

if(op==1){
A o1=new B();
t.t(o1);
}
else if(op==2){
A o2=new C();
t.t(o2);
}
else if(op==3){
A o3=new D();
t.t(o3);
D o4=(D)o3;  //downcasting  or we can directly create object for class D asses through it.
o4.m1();  /* if we use o3.m1 to print m1 method error occurs becuase the template or declaration of m1 is not there in interface A so we have to downcast and use that downcasted object to invoke m1 method. or we can create object foe class D use that object to invoke m1 but dont prefer this because lines of code increases and space consumption also.  */
}

else{
System.out.print("Invalid Input");
}

}
}

