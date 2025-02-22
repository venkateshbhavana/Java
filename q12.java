/*Create a Java application where we have a class it contains non static method m1 having parameter float, returns nothing then invoke this method under main method by providing dynamic inputs  */

import java.util.*;
class q12{
 void m1(float a){
System.out.println(a);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
float d=sc.nextFloat();
q12 obj=new q12();
obj.m1(d); //here we can give any variable it takes value from that in m1() method.
}

}
