/* create a java application where we have 1 class it contains 2 instance variables without values , by using double pc we need to provide user defined values for instance variables , we have 1 object pc if we call the instance variables through object of object pc we need to get same user defined values then invoke these 2 constructors by providing dynamic inputs. */

import java.util.*;
class q36{
static Scanner sc=new Scanner(System.in);
int a;
float b;
q36(){
}
q36(int a1,float b1){
a=a1;
b=b1;
}
q36(q36 o){
System.out.println(o.a+" "+o.b);
}

public static void main(String[] args){

q36 o1=new q36(sc.nextInt(),sc.nextFloat());
q36 o2=new q36();
q36 o3=new q36(o1);  // if we pass object o2 here it does not work because printing values a,b are there in o1 so use o1 .

}
}

