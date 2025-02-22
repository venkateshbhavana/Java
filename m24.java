/* 4.Create a java application where have one class which contains three private fields provide constructor Injection for two fields and setter injection for one field then retrieve the update values using getter methods with respect to user class by providing dynamic inputs. */

import java.util.*;

class A{
static Scanner sc=new Scanner(System.in);

private int id;
private String name;
private String pas=sc.next();

A(int id, String name)
{
   this.id=id;
   this.name=name;
}

void setter1(String pas)
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

class B {

public static void main(String[] args)
{

A o=new A(A.sc.nextInt(),A.sc.next());
o.setter1(A.sc.next());
System.out.println(o.getter1());
System.out.println(o.getter2());
System.out.println(o.getter3());

}
}

