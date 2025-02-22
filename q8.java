/*Q8. create a java application where we have one class it contains non static method m1 having parameter float, returns nothing static method m2 having parameter string, returns nothing. then invoke these 2 methods under main method.*/

class q8{

void m1(float a){
System.out.println(a);
}
static void m2(String b){
System.out.println(b);
}

public static void main(String[] args){
q8 obj=new q8();
obj.m1(2.1f);
m2("Score");

//System.out.println(b+"of Java is"+obj.a);  //  we cannot call method variables after method execution done.

}
}