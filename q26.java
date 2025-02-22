import java.util.*;
class q26{
static Scanner sc=new Scanner(System.in);
static q26 obj=new q26();

int m1(float f)
{
System.out.println(f);
return sc.nextInt();
}

String m2(int i){

System.out.println(i);

return sc.next();
}

boolean m3(String s){
System.out.println(s);

return sc.nextBoolean();
}

double m4(boolean b){
System.out.println(b);

return sc.nextDouble();
}

public static void main(String[] args){
System.out.println(obj.m4(obj.m3(obj.m2(obj.m1(sc.nextFloat())))));
}
}

