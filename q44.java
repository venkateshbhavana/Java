/* create a java application where we have 1 mobile manufacturing company their will design mobile with specific brand name , it contains specifications like ram ,rom,battery,and respective price  then they will release this mobile into whole sale market then the price has to increase from there it will be released into retailed market again price has to increase then this mobile will be purchased by customer then customer has to display all this values with respect to 1 method then invoke this method under main method;  */

import java.util.*;
class mobilecompany{
static Scanner sc=new Scanner(System.in);
//static mobilecompany obj=new mobilecompany();
String mname=sc.next();
int ram=sc.nextInt();
int rom=sc.nextInt();
int battery=sc.nextInt();
int price=sc.nextInt();

}

class wholesale extends mobilecompany{
int price2 =price +sc.nextInt();    // dont use same variable names here for updated variables.
}
class retaile extends wholesale{
int price3 =price2 +sc.nextInt();
}

class customer extends retaile{

 void m1(){
System.out.println(price3);
System.out.println(mname);
System.out.println(ram);
System.out.println(rom);
System.out.println(battery);
}


public static void main(String[] args){
customer obj=new customer();
obj.m1();
}
}