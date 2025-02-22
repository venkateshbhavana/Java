/* create a java application where we 1 class it contains non static method m1 having no parameters and returns nothing , again method m1 having parameter float , returns nothing ,again method m1 having parameter and return type, again method m1 having parameter double and return string value then invoke 1st m1 under 2nd m1, 2nd m1 under 3rd m1,3rd m1 under 4th m1, 4th m1 under main method by providing dynamic inputs. */

import java.util.*;
class q38{
static Scanner sc=new Scanner(System.in);

void m1(){
System.out.println("1st m1");
}

void m1(char c){
System.out.println(c);
m1();   // this.m1();  can be used or not used also no problem. there is no defferentiation or advantage of " this. " at Method Level.
}

float m1(int i){
System.out.println(i);
m1(sc.next().charAt(0));  //this.m1(sc.next().charAt(0)); 
return sc.nextFloat();
}

String m1(double f1){
System.out.println(f1);

System.out.println(m1(sc.nextInt()));   //----;

return sc.next();
}

public static void main(String[] args){
q38 ob=new q38();
System.out.println(ob.m1(sc.nextDouble()));

}
}
