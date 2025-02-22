/*9.	Write a program to sum all even numbers between 382 and 582. */
import java.util.*;
class e4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int s=0;
for(int i=a;i<=b;i++){
     if(i%2==0){
        s=i+s;
        }
 }
System.out.println(s);
}
}