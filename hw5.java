/* 5.create a java application where we have one class it contains 3 static methods like m1,m2 and m3 with
parameter and return type then invoke these methods according to your requirement .
Note: m1 return value should be the parameter for m2 method, m2 return value should be the return
value for m3 method. */

import java.util.*;
class hw5{
static Scanner sc=new Scanner(System.in);
//static hw5 obj=new hw5();

static String m1(float f){
System.out.println(f);

return sc.next();
}

static char m2(String s){
System.out.println(s);

return sc.next().charAt(0);
}

static char m3(long l){
System.out.println(l);

return m2(sc.next());
}

public static void main(String[] args){
System.out.println(m2(m1(sc.nextFloat())));
System.out.println(m3(sc.nextLong()));
}
}
