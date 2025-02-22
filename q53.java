/* create a java application where we have 1 class like g-mail which contains properties like mail-id and password provide setter and getter methods for this properties and invoke this methods under main method of user class by providing dynamic inputs. */

import java.util.*;

class g_mail{
Scanner sc=new Scanner(System.in);

String mail_id=sc.next();
String password=sc.next();

void setter(String mail_id,String password){

this.mail_id=mail_id;
this.password=password;

}

String getter(){
return mail_id;
}
String getter1(){
return password;
}

}

class user{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
g_mail o=new g_mail();
g_mail o1=new g_mail();

o.setter(sc.next(),sc.next());  
System.out.println(o.getter());  /* we have to use o object only to retrive updated mail id and passwod .if we use o1 we get the previous mail id and password.  */
System.out.println(o.getter1());
}
}