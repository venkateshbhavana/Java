/* 5.	Write a program to print all odd numbers from 251 to 51. like (251, 249,...51) */

import java.util.*;
class o1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=a;i>=b;i--){
if(i%2==1){
System.out.println(i);
}
}
}
}
