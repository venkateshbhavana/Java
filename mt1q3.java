import java.util.*;
class mt1q3{
static Scanner sc=new Scanner(System.in);
//static mt1q3 obj=new mt1q3();

static float m1(int i)
{
System.out.println(i);
return sc.nextFloat();

}
static String m2(float f)
{
System.out.println(f);
return sc.next();

}

public static void main(String[] args)
{
//int i=sc.nextInt();
System.out.println(m2(m1(sc.nextInt())));
}
}