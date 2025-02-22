class q21{
static java.util.Scanner sc=new java.util.Scanner(System.in);
long m1(float f)
{
System.out.println(f);

return sc.nextLong();
}

static String m2(q21 obj){
System.out.println(obj);
System.out.println(obj.m1(sc.nextFloat()));
return sc.next();
}

public static void main(String[] args){
q21 obj=new q21();

System.out.println(m2(obj));
}
}
