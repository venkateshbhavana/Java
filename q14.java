 /* create a java application where we have one class it contains static method m1 having parameter int,returns short value, non static method m2 having parameter character, returns string value then invoke m1 and m2 under main method by providing dynamic inputs. */

import java.util.*;
class q14{
static Scanner sc=new Scanner(System.in);

 static short m1(int a){

System.out.println(a);

System.out.println("enter short value");
short s=sc.nextShort();
return s;

}

String m2(char c){
System.out.println(c);
sc.nextLine();   //
System.out.println("enter String value");
String st=sc.nextLine();
return st;
}

public static void main(String[] args){
q14 obj=new q14();
System.out.println("enter int value");
int a=sc.nextInt();
System.out.println(m1(a));

System.out.println("enter char value");
char c=sc.next().charAt(0);
System.out.println(obj.m2(c));
}

}
