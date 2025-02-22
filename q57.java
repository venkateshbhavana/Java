import java.util.*;

class q57a{
static Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

void m1(float a){
System.out.println(a);
}
}

class q57b extends q57a{

String a=sc.next();
void m1(float a){
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
super.m1(sc.nextFloat());
}

public static void main(String[] args){

q57b o=new q57b();
o.m1(sc.nextFloat());

}
}
