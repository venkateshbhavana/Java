import java.util.*;

class Outer{
static Scanner sc=new Scanner(System.in);



static int m1(String a){
System.out.println(a);

return sc.nextInt();
}

static class inner{

long m2(float a){
System.out.println(a);
System.out.println(b);
return sc.nextLong();
}

}

public static void main(String[] args){

inner obj=new Outer(); 

System.out.println(m1(sc.next()));
System.out.println(obj.m2(sc.nextFloat()));

}

}