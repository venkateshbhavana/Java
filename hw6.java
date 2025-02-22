/* 1.create a java application where we have one class it contains default constructor,single parameterized constructor,double  parameterized constructor then invoke all the constructors under main method in a single statement by providing dynamic inputs. */

import java.util.*;
class hw6{
static Scanner sc=new Scanner(System.in);

hw6(){
System.out.println("default");
}

hw6(int a){
System.out.println(a);
}

hw6(String a,float b){
System.out.println(a+" "+b);

}

public static void main(String[] args){

hw6 a1=new hw6(new hw6().sc.next(),new hw6(sc.nextInt()).sc.nextFloat());

}
}