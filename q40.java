/*  create a java application where we need to satisfy this keyword at all three levels */

import java.util.*;
class q40{

static Scanner sc=new Scanner(System.in);
float a=sc.nextFloat();
void m1(long a){

System.out.println(a);
System.out.println(this.a);
}

boolean m1(String a){
System.out.println(a);
this.m1(sc.nextLong());
return sc.nextBoolean();
}

q40(double a){
System.out.println(a);
System.out.println(this.m1(sc.next()));
}

q40(String a){
this(sc.nextDouble());
System.out.println(a);
}

public static void main(String[] args){

q40 o1=new q40(sc.next());
}
}


