/* 1.create a java application where we have one class it contains non-static method m1 having parameter
and return type , by using this method find a given number is even or not if even this method has return
true otherwise it has to return false. */

import java.util.*;
class hw1{
 boolean m1(int n){
if(n%2==0)
{
//System.out.print("even");
return true;
}
else
{
//System.out.print("odd");
return false;
}

}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
hw1 obj=new hw1();
System.out.print(obj.m1(n));
}
}

