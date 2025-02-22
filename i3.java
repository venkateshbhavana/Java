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
}

class Test{
public static void main(String[] args){

Outer obj=new Outer(); 
Outer.inner o1=new Outer.inner();  


/*Outer obj=new Outer();
inner o1=new inner(); in these case this doesnot work because we accessing through from another class*/


System.out.println(obj.m1(Outer.sc.next()));
System.out.println(o1.m2(Outer.sc.nextFloat()));

}
}