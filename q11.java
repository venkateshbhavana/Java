/*Create a java application where we have one class it contains a static variable of integer data type and we have a non static method    having parameter as string it is going to return float value and we have static method having parameter as int it is going to return nothing invoke all these methods and variables under main method.*/

class q11{
static int a=25;
float m1(String b){
System.out.println(b);
return 3.678f;
}
static void m2(int a){
System.out.println(a);
}

public static void main(String[] args){

q11 obj1=new q11();
System.out.println(obj1.m1("venkat"));
m2(a);


}
}

