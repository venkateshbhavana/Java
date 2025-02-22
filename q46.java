/*  hybrid inheritance :-  combination of single level inheritance and multilevel inheritance or multilevel inheritance and hierarchical inheritance  */

import java.util.*;
class q46a{
static Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String b=sc.next();

}

class q46b extends q46a{
void display(){
System.out.println(b);
}

}
class q46c extends q46b{


}

class q46d extends q46b{


}
class q46e extends q46b{


public static void main(String[] args){
q46e o=new q46e();
System.out.println(o.b);
}
}

