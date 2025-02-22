import java.util.*;

class q41a{
static Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
static boolean b=sc.nextBoolean();  /*//1st compilor give space to static global variable and 2nd check for non static variable are there in global . and then executes Main method. */

static boolean m1(float f){
System.out.println(f);

return sc.nextBoolean();
}

char m2(double d){
System.out.println(d);

return sc.next().charAt(0);
}

// there is no need main method for parent class .

public static void main(String[] args){
q41a o1=new q41a();
System.out.println(o1.m2(sc.nextDouble()));
System.out.println(m1(sc.nextFloat()));

}

}
class q41b extends q41a{

static int m3(String s){
System.out.println(s);

return sc.nextInt();

}

public static void main(String[] args){
q41a o1=new q41a();
o1.main(null);
System.out.println(m3(sc.next()));
System.out.println(o1.a);
System.out.println(b);
System.out.println(o1.m1(sc.nextFloat()));
System.out.println(o1.m2(sc.nextDouble())); // using object we can invoke non static methods of parent class.
}
}

