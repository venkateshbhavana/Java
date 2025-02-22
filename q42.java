/*  create a java application where we have a software company it will provide employ id ,employe name,employ designation , employ salary and  working location to one employee then employee has to access these properties and need to print these values with respect to 1 method then invoke that method under main method.  */

import java.util.*;
class q42a{
static Scanner sc=new Scanner(System.in);
static int emp_id=sc.nextInt();
static String emp_name=sc.next();
static String emp_desig=sc.next();
static float emp_salary=sc.nextFloat();
static String emp_workLoc=sc.next();

}

class q42b extends q42a{

 void display(){
System.out.println("emp_id "+emp_id);
System.out.println("emp_name "+emp_name);
System.out.println("emp_desig "+emp_desig);
System.out.println("emp_salary "+emp_salary);
System.out.println("emp_workLoc "+emp_workLoc);

}

public static void main(String[] args){
new q42b().display();
}
}


