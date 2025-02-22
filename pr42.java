/*create a java application where we have 3 private fields create setter and getter methods for all these properties then update and retrieve the values form  user class .*/


import java.util.*;

class A{
static Scanner sc=new Scanner(System.in);

private int id;
private String name;
private String pas;

A(int id, String name, String pas)
{
   this.id=id;
   this.name=name;
   this.pas=pas;
}

void setter1(int id)
{
  this.id=id;
}
void setter2(String name)
{
  this.name=name;
}
void setter3(String pas)
{
  this.pas=pas;
}

int getter1()
{

  return id;
}

String getter2()
{

  return name;
}

String getter3()
{

  return pas;
}

}

class User {

public static void main(String[] args)
{

A o=new A(A.sc.nextInt(),A.sc.next(),A.sc.next());
System.out.println("Enter the Details to update:-");
o.setter1(A.sc.nextInt());
o.setter2(A.sc.next());
o.setter2(A.sc.next());
System.out.println("updated Details:-");
System.out.println(o.getter1());
System.out.println(o.getter2());
System.out.println(o.getter3());

}
}

