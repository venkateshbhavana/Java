/*create a java application where we have 1 class it contains single parameterized constructor(pc) double pc and thrible pc then invoke all these constructors under main method by proving dynamic inputs.*/

import java.util.*;
class q32{

q32(int i){
System.out.println(i);
}

q32(int i, float f){
System.out.println(i);
System.out.println(f);
}

q32(int i, float f,String s){
System.out.println(i);
System.out.println(f);
System.out.println(s);
}

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
q32 c1=new q32(sc.nextInt());
q32 c2=new q32(sc.nextInt(),sc.nextFloat());
q32 c3=new q32(sc.nextInt(),sc.nextFloat(),sc.next());
}
}