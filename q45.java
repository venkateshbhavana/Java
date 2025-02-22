//hierarchical Inheritance

import java.util.*;
class bank{
static Scanner sc=new Scanner(System.in);

String name=sc.next();
int accountnum=sc.nextInt();
String branch=sc.next();
float balance=sc.nextFloat();
int atmpin=sc.nextInt();

 
}

class cu1 extends bank{
void display1(){

System.out.println(name);
System.out.println(accountnum);
System.out.println(branch);
System.out.println(balance);
System.out.println(atmpin);
}
}

class cu2 extends bank{
void display2(){

System.out.println(name);
System.out.println(accountnum);
System.out.println(branch);
System.out.println(balance);
System.out.println(atmpin);
}
}

class cu3 extends bank{
void display3(){

System.out.println(name);
System.out.println(accountnum);
System.out.println(branch);
System.out.println(balance);
System.out.println(atmpin);
}
}

class cu4 extends bank{
void display4(){

System.out.println(name);
System.out.println(accountnum);
System.out.println(branch);
System.out.println(balance);
System.out.println(atmpin);
}


public static void main(String[] args){
cu1 o1=new cu1();
o1.display1(); 
 
       /* we can use display1 name same for all methodes in all customer classes , because we are calling thourgh individual objects , so it will call that particular class method only so if we use same method names also no error occurs while calling that methods through individual objects.  */

cu2 o2=new cu2();
o2.display2();
cu3 o3=new cu3();
o3.display3();
cu4 o4=new cu4();
o4.display4();



}
}

/*



import java.util.*;
class bank{
static Scanner sc=new Scanner(System.in);

String name=sc.next();
int accountnum=sc.nextInt();
String branch=sc.next();
float balance=sc.nextFloat();
int atmpin=sc.nextInt();

 
}

class cu1 extends bank{
void display1(){

System.out.println(name);
System.out.println(accountnum);
System.out.println(branch);
System.out.println(balance);
System.out.println(atmpin);
}
}

class cu2 extends bank{
void display2(){

System.out.println(name);
System.out.println(accountnum);
System.out.println(branch);
System.out.println(balance);
System.out.println(atmpin);
}
}

class cu3 extends bank{
void display3(){

System.out.println(name);
System.out.println(accountnum);
System.out.println(branch);
System.out.println(balance);
System.out.println(atmpin);
}
}

class cu4 extends bank{
void display4(){

System.out.println(name);
System.out.println(accountnum);
System.out.println(branch);
System.out.println(balance);
System.out.println(atmpin);
}


public static void main(String[] args){
cu1 o1=new cu1();
o1.display1(); 
 
       /* we can use display1 name same for all methodes in all customer classes , because we are calling thourgh individual objects , so it will call that particular class method only so if we use same method names also no error occurs while calling that methods through individual objects.  */


o1.display2();    //in herarchical inheritance only we inherits base class so we need to create objects for every class to to access that class methods and runs.

o1.display3();

o1.display4();



}
}

*/
