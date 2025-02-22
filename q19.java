/*  create a java application where we have 1 class it contains a non-static method m1 having parameter as Boolean it is going to return string value, we have non static method m2 having parameter as integer it is going to return string value, and we have static method m3 having parameter as float it is going to return m1 return value invoke m2 and m3 under main method */

import java.util.*;
class q19{

static Scanner sc=new Scanner(System.in);
static q19 obj=new q19();

String m1(boolean b){
System.out.println(b);

return sc.next();
}

String m2(int i){
System.out.println(i);

return sc.next();
}

static String m3(float f){
System.out.println(f);

return obj.m1(sc.nextBoolean());
}

public static void main(String[] args){
int a=sc.nextInt();
System.out.println(obj.m2(a));

float f=sc.nextFloat();
System.out.println(m3(f));
}
}
