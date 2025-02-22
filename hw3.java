/*  3.create a java application where we have one class it contains non-static method m1 having no
parameter and returns nothing this method contains local variable like string we need send this String
value as parameter for second method invoke methods by providing dynamic inputs. */

import java.util.*;
class hw3{
static Scanner sc=new Scanner(System.in);
void m1(){
String s=sc.next();
m2(s);
}

void m2(String s){

System.out.print(s);
}

public static void main(String[] args){
hw3 obj=new hw3();

obj.m1();
}
}


