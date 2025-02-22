/*4.	Write a program to print all even numbers in range 700 to 900.*/

import java.util.*;
class e1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
 for(int i=a;i<=b;i++){
      if(i%2==0){
         System.out.println(i);
       }
}
}
}
