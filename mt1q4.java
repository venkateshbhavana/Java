import java.util.*;
class mt1q4{
static Scanner sc=new Scanner(System.in);


int id;
String name;
float salary;

void m1(int i,String n,float s)
{
id=i;
name=n;
salary=s;


}

void display()
{

System.out.println(id);
System.out.println(name);
System.out.println(salary);
}

public static void main(String[] args){
//mt1q4 obj=new mt1q4();
//e1.m1(sc.nextInt(),sc.next(),sc.nextFloat());
mt1q4 e1=new mt1q4();
e1.m1(sc.nextInt(),sc.next(),sc.nextFloat());
e1.display();
mt1q4 e2=new mt1q4();
e2.m1(sc.nextInt(),sc.next(),sc.nextFloat());
e2.display();
mt1q4 e3=new mt1q4();
e3.m1(sc.nextInt(),sc.next(),sc.nextFloat());
e3.display();

}
}