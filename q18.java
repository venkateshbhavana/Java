/* create a java application where we have one class it contains 1 static method m1 having parameter as string it is going to return Boolean value and we have a non static method m2 having parameter as int and it is going to return m1 return value invoke m2 under main method. */

import java.util.*;
class q18{
static Scanner sc=new Scanner(System.in);
static q18 obj=new q18();

static Boolean m1(String s){

System.out.println(s);

return sc.nextBoolean();
}

Boolean m2(int i){
System.out.println(i);

String s=sc.next();

//boolean x=m1(s);
//System.out.println(x); // or directly write as System.out.println(m1(sc.next)());
return m1(sc.next());

}

public static void main(String[] args){
int i=sc.nextInt();
System.out.println(obj.m2(i));

}
}