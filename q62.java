import java.util.*;
abstract class q62{
static Scanner sc=new Scanner(System.in);



static int m1(String a){
System.out.println(a);
return sc.nextInt();
}


public static void main(String[]  args){


//q62 o=new q62(); //through object we get eror because object cannot create for abstract classs. so by another way take method as static.
System.out.println(m1(sc.next()));

}
}