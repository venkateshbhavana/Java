/*
import java.util.*;
class q52a{
Scanner sc=new Scanner(System.in);
private int atmpin=sc.nextInt();

void setAtmpin(int atmpin1){
//this.atmpin=atmpin;
atmpin=atmpin1;
}

int getAtmpin(){

return atmpin;
}

}

class q52b{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  //
q52a o1=new q52a();
q52a o=new q52a(); 
o.setAtmpin(sc.nextInt());
System.out.println(o1.getAtmpin());
}
}

*/
// creating storage or space using setter constructor and updating using setter method
import java.util.*;
class q52a{
Scanner sc=new Scanner(System.in);
private int atmpin;

q52a(int atmpin1){
//this.atmpin=atmpin;
atmpin=atmpin1;
}

void setter(int atmpin){
this.atmpin=atmpin;
}

int getAtmpin(){

return atmpin;
}

}

class q52b{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
 
q52a o1=new q52a(sc.nextInt());
o1.setter(sc.nextInt());
System.out.println(o1.getAtmpin());
}
}