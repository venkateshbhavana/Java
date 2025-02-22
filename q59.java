import java.util.*;
abstract class q59a{
static Scanner sc=new Scanner(System.in);
abstract int m1(String a);
 abstract boolean m2(float a);

}

class q59b extends q59a{

int m1(String a){
System.out.println(a);
return sc.nextInt();
}

 boolean m2(float a){
System.out.println(a);
return sc.nextBoolean();
}

public static void main(String[]  args){


q59b o=new q59b();
System.out.println(o.m1(sc.next()));
System.out.println(o.m2(sc.nextFloat()));
}
}