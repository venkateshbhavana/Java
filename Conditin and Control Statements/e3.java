/*7.	Write a program to print alternate even numbers from 20 to 140. Like (20,24,28...) */
import java.util.*;
class e3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=0;
for(int i=a;i<=b;i++){
     if(i%2==0){
       c++;
      if(c%2==1){
        System.out.println(i);
        }
      }
  }
}
} 