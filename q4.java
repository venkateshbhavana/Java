/*Q.4.Create a java application where we have  1 class it contains 2 non-static variable with values then access these 2 variables under main method.*/

class q4{
int a=5;
int b=10;
public static void main(String[] args){
//we need object to access non-static variables.
q4 obj=new q4();
obj.a=obj.a;
System.out.println(obj.a); // we should always use obj.variable to print or access.otherwise it will access still as non static variable.
}
}