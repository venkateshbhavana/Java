/*  create a java application where we have 1 class which contains default constructor, single pc,double pc, triple pc then invoke default under single; single under double; double under triple; triple under main method; by providing dynamic inputs and by using this keyword.  


// Normal Way


import java.util.*;
class q39{

static Scanner sc=new Scanner(System.in);

q39(){

System.out.println("default");
}

q39(int i){

System.out.println(i);
q39 o2=new q39();
}

q39(float f, String s){
System.out.println(f+" "+s);
q39 o3=new q39(sc.nextInt());
}

q39(char c,boolean b,long l){

System.out.println(c+" "+b+" "+l);

q39 o4=new q39(sc.nextFloat(),sc.next());
}

public static void main(String[] args){
q39 o1=new q39(sc.next().charAt(0),sc.nextBoolean(),sc.nextLong());

}
}

*/

import java.util.*;
class q39{

static Scanner sc=new Scanner(System.in);

q39(){

System.out.println("default");
}

q39(int i){
this();

System.out.println(i);
}

q39(float f, String s){
this(sc.nextInt());
System.out.println(f+" "+s);
}

q39(char c,boolean b,long l){

this(sc.nextFloat(),sc.next());    // we should have to invoke constructor at first line in a constructor
System.out.println(c+" "+b+" "+l);
}

public static void main(String[] args){
q39 o1=new q39(sc.next().charAt(0),sc.nextBoolean(),sc.nextLong());

}
}

