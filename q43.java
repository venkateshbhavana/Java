/*  create a java application where we have 1 class which contains 1 static variable and 1 non-static variable, static method with parameter and return type inherit this class into another class which contains static and non static variable and 1 non-static method with parameter and return type inherit this class into another class which contains static and non static variables , 1 static and non -static method with parameter and return type then invoke all the properties under main method by providing dynamic inputs.  */

import java.util.*;
class q43a{
static Scanner sc=new Scanner(System.in);
static String a=sc.next();
byte b=sc.nextByte();

static Boolean m1(float a){
System.out.println(a);

return sc.nextBoolean();

}

}
class q43b extends q43a{
static char c=sc.next().charAt(0);
boolean d=sc.nextBoolean();

 String m2(int a){
System.out.println(a);
return sc.next();
}
}

class q43c extends q43b{
static float a=sc.nextFloat();
String f=sc.next();

static int m3(String a){
System.out.println(a);

return sc.nextInt();
}

float m4(char a){
System.out.println(a);

return sc.nextFloat();
}

public static void main(String[] args){
q43c o1=new q43c();
System.out.println(m3(sc.next()));
System.out.println(o1.m4(sc.next().charAt(0)));
System.out.println(a);
System.out.println(o1.b);

}

}

