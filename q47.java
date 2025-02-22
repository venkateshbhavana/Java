import java.util.*;

class q47a{
static Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

}

class q47b extends q47a{

String a=sc.next();
void m1(){
System.out.println(a);

System.out.println(super.a);
}

public static void main(String[] args){
q47b o=new q47b();
o.m1();

}
}
