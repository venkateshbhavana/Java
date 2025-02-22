import java.util.*;
class q37{
static Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

void m1(String a){
System.out.println(a);
System.out.println(this.a);   //this.a prints global variable or class variable.if variables are same
}

public static void main(String[] args){
new q37().m1(sc.next());
//obj.m1(sc.next());  //or

}
}