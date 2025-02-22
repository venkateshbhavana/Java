import java.util.*;
abstract class q60a{
static Scanner sc=new Scanner(System.in);
abstract int m1(String a);
abstract boolean m2(float a);

}

class q60b extends q60a{

int m1(String a){
System.out.println(a);
return sc.nextInt();
}

boolean m2(float a){
System.out.println(a);
return sc.nextBoolean();
}

}


class q60c extends q60b{
int m1(String a){
System.out.println(a);
return sc.nextInt();
}

boolean m2(float a){
System.out.println(a);
return sc.nextBoolean();
}
public static void main(String[]  args){


q60c o=new q60c();  /* it first go to abstract class and check overrided method there in class 60c then executes functionality. it is based on for which class we are creating object , which object we are using that class functionality will run . */
System.out.println(o.m1(sc.next()));
System.out.println(o.m2(sc.nextFloat()));
}
}
