/*Q6. create a java application where we have a class it contains non-static method 'm1'  having no parameter , returns nothing when we invoke this method under main methed it has to display any user freindly message.*/

class q6{
 void m1(){
System.out.println("m1 method");
}

public static void main(String[] args){
q6 obj=new q6();
obj.m1();
}
}


