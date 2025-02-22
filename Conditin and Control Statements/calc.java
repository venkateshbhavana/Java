/*3.	Write a program to perform simple math based on the user inputs by using Switch condition.(+ , - , * , /)*/

/*
import java.util.*;
class calc{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();

    sc.nextLine();     // if not use if loop not executed
double s;

System.out.println("select the operation to perform:");
System.out.println("+");
System.out.println("-");
System.out.println("*");
System.out.println("/");

String p=sc.nextLine();
if(p.equals("+")){          // not use p == "+"
s=a+b;
System.out.println(s);
}
else if(p.equals("-")){
s=a-b;
System.out.println(s);
}
else if(p.equals("*")){
s=a*b;
System.out.println(s);
}
else if(p.equals("/")){
s=a/b;
System.out.println(s);
}
else{
System.out.println("select valid operator");
}
}
}

*/

import java.util.*;
class calc{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
sc.nextLine();
String n=sc.nextLine();
double s;
switch(n){

case "+":
          s=a+b;
          System.out.println(s);
          break;

case "-":
          s=a-b;
          System.out.println(s);
          break;

case "*":
          s=a*b;
          System.out.println(s);
          break;
case "/":
          s=a/b;
          System.out.println(s);
          break;

default :
          
          System.out.println("Not found any opertor");

}
}
}



