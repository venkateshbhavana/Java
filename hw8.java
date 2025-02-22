/* create a java application where we have one class it contains default constructor,,single parameterized constructor,
 two  static methods with parameter and return type then all these under main method by providing dynamic inputs.
*/

import java.util.*;
class hw8{
static Scanner sc=new Scanner(System.in);
hw8(){
System.out.println("default");
}

hw8(int a){
System.out.println(a);
}

static String m1(int a)
{
System.out.println(a);
return sc.next();
}

static float m2(char c)
{
System.out.println(c);
return sc.nextFloat();
}

public static void main(String[] args)
{
hw8 a1=new hw8();
hw8 a2=new hw8(sc.nextInt());
System.out.println(m1(sc.nextInt()));
System.out.println(m2(sc.next().charAt(0)));

}
}