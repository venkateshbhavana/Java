import java.util.*;

class parent{
void p(){
System.out.println("method of p");
}
}

class child extends parent{
void p(){
System.out.println("method of c");
}
}

class upcasting{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);

parent o1=new child();
parent o2=new child();
o1.p();
o2.p();

}
}