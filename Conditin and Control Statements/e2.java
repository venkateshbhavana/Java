/*6.	Write a Program to print the count of the even numbers between the given range? */

import java.util.*;
class e2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=0;
for(int i=a;i<=b;i++){
   if(i%2==0){
    c++;
    }
 }
System.out.println(c);
}
}
