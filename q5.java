class q5{
static int a;
static int b;
static int c;
int d;
int e;
public static void main(String[] args){
int l1=5;
int l2=10;
q5 obj=new q5();
a=2;   // no need obj. for static variables a,b,c if we put also no problem.
b=4;
c=6;
obj.d=8;
obj.e=10;
System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.c);
System.out.println(obj.d);
System.out.println(obj.e);
System.out.println(l1);
System.out.println(l2);
}
}
