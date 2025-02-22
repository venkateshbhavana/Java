/*  create a java application where we have one class it contains three instance variables  then provide user defined values by using thriple parameterized constructor , static method with parameter and return type ,one object parameterized constructor then invoke thriple under main static method under object parameterized when we access instance variables in static method it has to display same user defined values. */

import java.util.*;
class hw10{
static Scanner sc=new Scanner(System.in);
int a;
float b;
String s;

hw10(int a1,float b1,String s1){
a=a1;
b=b1;
s=s1;

}

static int m1(hw10 ob){
System.out.println(ob.a);
System.out.println(ob.b);
System.out.println(ob.s);

return sc.nextInt();
}

hw10(hw10 obj){
//System.out.println(obj);
m1(obj);
}

public static void main(String[] args){
hw10 obj=new hw10(sc.nextInt(),sc.nextFloat(),sc.next());
hw10 obj1=new hw10(obj);
}
}