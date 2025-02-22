/* create a java application where we have one class it contains thriple parameterized constructor having parameters like String,double,Classname then invoke this constructor under main method by providing dynamic inputs. */

import java.util.*;

class hw7{
hw7(){

}

hw7(String s,double d,hw7 obj1){
System.out.println(s);
System.out.println(d);
System.out.println(obj1);
}

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
hw7 obj1=new hw7();
hw7 obj=new hw7(sc.next(),sc.nextDouble(),obj1);
}
}
