import java.util.*;
class A{

 A(int s){  // parameterized constructor.
System.out.println(s);
}

}
class q31{

 q31(String s){  // parameterized constructor.
System.out.println(s);
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
A obj=new A(sc.nextInt());
q31 o=new q31(s);
}
}
