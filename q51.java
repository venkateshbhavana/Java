/* create a java application  where we have 1 class which contains m1,m2,m3 methods with parameter and return types, we have another class which contains m4,m5,m6 methods then access m1 under m4, m3 under m6 then invoke m4 and m6 under main method of some other class by providing dynamic inputs */

import java.util.*;
class q51a{
static Scanner sc=new Scanner(System.in);
int m1(float a){

System.out.println(a);
return sc.nextInt();
}

String m2(int a){

System.out.println(a);
return sc.next();
}

boolean m3(char a){

System.out.println(a);
return sc.nextBoolean();
}

}

class q51b{
static Scanner sc=new Scanner(System.in);
q51a o=new q51a();  // if we use this object it will acess all properties in class q51a.
int m4(boolean a){
q51a o1=new q51a();   // if we use this object all properties of class q51a will access to this m4 method only.because we use object locally.
o1.m1(sc.nextFloat());
System.out.println(a);
return sc.nextInt();
}

float m5(long a){

System.out.println(a);
return sc.nextFloat();
}

String m6(byte a){
q51a o1=new q51a();
o1.m3(sc.next().charAt(0));
System.out.println(a);
return sc.next();
}

}

class q51c{
static Scanner sc=new Scanner(System.in);
public static void main(String[] args){
q51b o=new q51b();
System.out.println(o.m4(sc.nextBoolean()));
System.out.println(o.m6(sc.nextByte()));
}
}
