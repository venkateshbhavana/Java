 /* create a java application where we have 1 class it contains 2 instance variables without values then provide user defined values for instance variable by using double pc then invoke this constructor under main method and display the updated values of instance variables. */

import java.util.*;
class q34{

q34(){
}
static Scanner sc=new Scanner(System.in);

int i;
float f;

q34(int a,float b)
{
i=a;
f=b;
System.out.println(i+" "+f);
}

public static void main(String[] args){

q34 pc=new q34(sc.nextInt(),sc.nextFloat());
q34 pc1=new q34();
System.out.println(pc1.i+" "+pc1.f);  
/* if we use MT object we get instance avriables as 0 and 0.00; because we use  updated values which are in double pc assign values to instance varibles after asssign we can print user defined values  */

}
}
