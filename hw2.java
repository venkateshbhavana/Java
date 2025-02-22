/* 2.create a java application where we have one class it contains two static methods with parameter and
return type if first method returns true then only we need to invoke second method.  */

import java.util.*;
class hw2{
static Scanner sc=new Scanner(System.in);
 static boolean m1(float f){

return false;
}
static int m2(String s){
System.out.println(s);
return sc.nextInt();
}

public static void main(String[] args){

if(m1(sc.nextFloat())){
System.out.println(m2(sc.next()));

}
}
}