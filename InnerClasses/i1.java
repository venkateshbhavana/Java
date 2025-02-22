import java.util.*;

class Outer{
static Scanner sc=new Scanner(System.in);

private boolean b=sc.nextBoolean();

static int m1(String a){
System.out.println(a);

return sc.nextInt();
}

class inner{

long m2(float a){
System.out.println(a);
System.out.println(b);
return sc.nextLong();
}

}

public static void main(String[] args){

inner obj=new Outer().new inner(); /* for m2 method access  must create object for inner class . non static class kabatti outer class object tho inner class ki object create cheyali. */

System.out.println(m1(sc.next()));  /*here if we obj.m1 error occures se we used static method in outer class , because we didnot stored outer class object.*/
System.out.println(obj.m2(sc.nextFloat()));

}

}