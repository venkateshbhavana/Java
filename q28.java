
import java.util.*;
class q28{
static Scanner sc=new Scanner(System.in);
long m1(int a)
{
System.out.println(a);
return sc.nextLong();
}

static q28 m2(double a)
{
System.out.println(a);
return new q28();
}

public static void main(String[] args)
{
q28 obj=m2(sc.nextDouble());

System.out.println(obj.m1(sc.nextInt()));

}
}






































