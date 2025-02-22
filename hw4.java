/* 4.creata a java application where we have one class it contains static method m1 having no parameter
and returns nothing ,static method m2 having parameter and return type ,non -static method m3 having
parameter and return type then invoke m3 under m2 method and we are allowed to create object only
inside the m1 method by providing dynamic inputs. */

import java.util.*;
class hw4{
static Scanner sc=new Scanner(System.in);
//static hw4 obj=new hw4();

static void m1(){
hw4 obj=new hw4();
m2(obj);
}

static int m2(hw4 obj){
//System.out.println(f);
obj.m3(sc.next().charAt(1));
return sc.nextInt();
}

String m3(char c){
System.out.println(c);

return sc.next();
}

public static void main(String[] args){

m1();
}
}