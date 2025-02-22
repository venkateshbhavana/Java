import java.util.*;
class mt1q2{
static Scanner sc=new Scanner(System.in);
static mt1q2 obj=new mt1q2();

int m1(){
return sc.nextInt();
}

int m2(){
return sc.nextInt();
}

int add(){
 int a=m1()+m2();
return a;
}

public static void main(String[] args){
System.out.println(obj.add());

}
}