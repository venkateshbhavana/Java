/*  create a java application where we have 1 class which contains non-static method m1 having parameter float , returns string value ,then inherit this class into another class which contains same method m1 with same parameter and return type then inherit this class into another class which contains again same method m1 with same parameter and return type then invoke 1st m1 under 2nd m1 ,2nd m1  under 3rd m1 , 3rd m1 under main method by providing dynamic inputs and by using super keyword.  */

import java.util.*;
class q48a{

static Scanner sc=new Scanner(System.in);
 String m1(float a){
System.out.println(a);

return sc.next();
}

}

class q48b extends q48a{

String m1(float a){
System.out.println(a);
System.out.println(super.m1(sc.nextFloat()));   /* if we dont use super keyword while call m1 method it dont go parent class it keep on recusively call same method in same class .  so use of super in methods must to call parent class methods without creating objects*/
return sc.next();
}

}

class q48c extends q48b{

String m1(float a){
System.out.println(a);
System.out.println(super.m1(sc.nextFloat()));
return sc.next();
}

public static void main(String[] args){
q48c o=new q48c();
System.out.println(o.m1(sc.nextFloat()));

}
}
