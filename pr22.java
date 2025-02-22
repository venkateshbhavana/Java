/* 2)create a java application where we have one class like college it contains private variables like id, name, salary and we have separate class student we have to enter students from student class using constructor injection and getter method. print all those values in main method of student class.*/

import java.util.*;
class colege{
static Scanner sc=new Scanner(System.in);

private int id;
private String name;
private double sal;


colege(int id,String name,double sal){
this.id=id;
this.name=name;
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

colege o=new colege(sc.nextInt(),sc.next(),sc.nextDouble());



System.out.println("Updated Details");

System.out.println(o.getter1());
System.out.println(o.getter2());
System.out.println(o.getter3());

}
}