/* create a java application where we have one class which contains default constructor then inherit this class into another class which contains single parameterized constructor then inherit this class into another class which contains double parameterized constructor then inherit this class into another class which contains default constructor then inherit this class into another class which contains parametrized constructor then invoke constructor with in a another constructor of derived class and last constructor under main method by providing dynamic inputs and by using super keyword.  */

import java.util.*;
class q49a{
static Scanner sc=new Scanner(System.in);

q49a(){
System.out.println("Default-A");
}

}

class q49b extends q49a{

q49b(int a){
super();       // if for calling default constructor no need to use super(), if we want call parametrized constructor we must use super keyword.
System.out.println(a);
}

}

class q49c extends q49b{

q49c(int a,String b){
super(sc.nextInt());
System.out.println(a+" "+b);
}

}

class q49d extends q49c{

q49d(){
super(sc.nextInt(),sc.next());
System.out.println("Default-B");
}

}

class q49e extends q49d{
//super();          // if we call default constructor 2 times 
q49e(char a){
System.out.println(a);
}

public static void main(String[] args){
q49e o=new q49e(sc.next().charAt(0));

}

}

/*  super and this keywords not used in methods to call constructors use only manual objects */
