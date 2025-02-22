import java.util.*;

class Outer{
static Scanner sc=new Scanner(System.in);



 int m1(String a){
System.out.println(a);

return sc.nextInt();
}

static class inner{

long m2(float a){
System.out.println(a);

return sc.nextLong();
}

}

public static void main(String[] args){

Outer obj=new Outer(); 
Outer.inner o1=new Outer.inner();  // or inner o1=new Outer.inner();


/*
inner obj=new Outer().new inner(); we cannot use this because inner class is static we dont need to access through object we must access through class name.

Outer obj=new Outer();
inner obj=new inner(); this also can work because outer class we are accessing,outside outer class we cannot write this
*/ 


System.out.println(obj.m1(sc.next()));
System.out.println(o1.m2(sc.nextFloat()));

}

}