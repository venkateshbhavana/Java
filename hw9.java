/*  create a java application where we have one class it contains default constructor,,single parameterized constructor,
  two static methods  with parameter and return type then invoke all these under main method in a single statement by providing dynamic inputs.
*/
import java.util.*;
class hw9{
static Scanner sc=new Scanner(System.in);
hw9(){
System.out.println("default");
}
hw9(char a){
System.out.println(a);
}

 float m1(hw9 s){
System.out.println(s);
return sc.nextFloat();
}

static char m2(boolean b){
System.out.println(b);

return sc.next().charAt(0);
}

public static void main(String[] args){

new hw9(m2(sc.nextBoolean())).m1(new hw9());

}
}