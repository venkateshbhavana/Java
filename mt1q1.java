import java.util.*;
class mt1q1
{
static Scanner sc=new Scanner(System.in);
boolean b=sc.nextBoolean();  //instance or non static variable
static float f=sc.nextFloat();
static char c=sc.next().charAt(0);

public static void main(String[] args)
{
String s=sc.next();
System.out.println(s);

mt1q1 obj=new mt1q1();

System.out.println(obj.b);
System.out.println(f);
System.out.println(c);
}
}

/*

Execution:-

->1st compilor takes input from static variables present in class or global variables.

->2nd directly go to main method if object is there at 1st line itself then compiler asks input for non-static variable id it present as global variable.

->after wards executes line by line

*/