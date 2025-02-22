/* 1) create a java application where we have one class like college it contains private variables like id, name, salary and we have separate class student we have to enter students from student class using setter injection and getter method print all those values in main method of student class.*/

import java.util.*;
class colege{
static Scanner sc=new Scanner(System.in);

private int id=sc.nextInt();
private String name =sc.next();
private double sal=sc.nextDouble();

void m1(){
System.out.println(id+"  "+name+"  "+sal);
}

void setter1(int id){
this.id=id;


}
void setter2(String name){

this.name=name;
}

void setter3(double sal){

this.sal=sal;

}

int getter1(){

return id;
}

String getter2(){

return name;
}

double getter3(){

return sal;
}

}

class student{
static Scanner sc=new Scanner(System.in);
public static void main(String[] args){
colege o=new colege();
System.out.println("Initial Details");
o.m1();// print initial values only using getter method . not do like this by creating method.

o.setter1(sc.nextInt());
o.setter2(sc.next());
o.setter3(sc.nextDouble());
System.out.println("Updated Details");
System.out.println(o.getter1());
System.out.println(o.getter2());
System.out.println(o.getter3());

}
}