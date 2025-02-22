/* create a java application where we need to satisfy constructor overloading method overloading and method overriding by using 2 classes */
import java.util.*;

class q58a{
static Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

void m1(float a){
System.out.println(a);
System.out.println(m1(sc.nextFloat(),sc.next().charAt(0)));
}


int m1(float a,char b){      // if we use static for this methods it cannot be overrided so error occures. 
System.out.println(a+"  "+b);
return sc.nextInt();
}

}

class q58b extends q58a{

String a=sc.next();


void m1(float a){
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
super.m1(sc.nextFloat());
}
q58b(boolean a,int b){
System.out.println(a+"  "+b);

}

q58b(boolean a){
this(sc.nextBoolean(),sc.nextInt());
m1(sc.nextFloat());

System.out.println(a);
}


public static void main(String[] args){

q58b o=new q58b(sc.nextBoolean());


}
}
/* if in base class contructor is there we have to call that constructor in drived class by using super keyword only otherwise it will through error. */
