/* create java application where we have one class it contains non static method m1 having  no parameters , returns nothing static method m2 having parameter float , returns nothing then invoke m1 under m2 m2 under main method by providing dynamic inputs. */

import java.util.*;
class q15{
static q15 obj=new q15();
static Scanner sc=new Scanner(System.in);
void m1(){
     System.out.println("m1 method");              }
}
static void m2(float a){

// we have to creste object whereever we want to  use means we to create object here. or if we create globally under class main also it works.


obj.m1();
System.out.println(a);
}
 public static void main(String[] args){

float a=sc.nextFloat();
m2(a);

}
}
