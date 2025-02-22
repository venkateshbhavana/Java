/* Write a java application that contains method injection and constructor injection */

import java.util.*;

class g_mail1{
Scanner sc=new Scanner(System.in);

private String mail_id;
private String password;

//constructor Injection 
g_mail1(String mail_id,String password){

this.mail_id=mail_id;
this.password=password;

}

//Method injection
void Setter(String mail_id){

this.mail_id=mail_id;

}
void Setter1(String password){
this.password=password;
}


String getter(){
return mail_id;
}


String getter1(){
return password;
}

}

class user1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);


System.out.println("enter user1 input");
g_mail1 o1=new g_mail1("venkat1111@gmail.com","52525@fgh"); 

System.out.println("enter user2 input");
g_mail1 o2=new g_mail1("Ainash1111@gmail.com","12325@fgh"); 

System.out.println("enter user3 input");
g_mail1 o3=new g_mail1("ramesh1111@gmail.com","7895@fgh"); 

System.out.println();
System.out.println("which user password you want to change");
System.out.println("1 "+o1.getter()+" "+o1.getter1());
System.out.println("2 "+o2.getter()+" "+o2.getter1());
System.out.println("3 "+o3.getter()+" "+o3.getter1());
System.out.println();
int am = sc.nextInt();
if(am==1)
{
 o1.Setter1(sc.next());
}
else if(am==2)
{
 o2.Setter1(sc.next());
}
else if(am==3)
{
  o3.Setter1(sc.next());
}
else
{
   System.out.println("in valid user");
}
System.out.println();
System.out.println(o1.getter()+" "+o1.getter1());
System.out.println(o2.getter()+" "+o2.getter1());
System.out.println(o3.getter()+" "+o3.getter1());

}
}