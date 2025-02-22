/* 3. Create a java application where have one class which contains non-static method m1 having parameter and return type, static methods m2,m3 and m4 with parameter and return type and default constructor, single parameterized constructor and double parameterized constructor then invoke all the properties under main method in a single statement by providing dynamic inputs. */

import java.util.*;

class A{
static Scanner sc=new Scanner(System.in);

A(){
System.out.println("Default");
}

A(A a){
System.out.println(a);
}

A(boolean a,int b){
System.out.println(a+"  "+b);
}

static boolean m1(String a){
System.out.println(a);
return sc.nextBoolean();
}

 int m2(float a){
System.out.println(a);
return sc.nextInt();
}

static boolean m3(int a){
System.out.println(a);
return sc.nextBoolean();
}

 static float m4(boolean a){
System.out.println(a);
return sc.nextFloat();
}


public static void main(String[] args){
A o=new A(new A(m1(sc.next()),new A().m2(m4(m3(sc.nextInt())))));

}
}

