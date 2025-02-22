
import java.util.*;
class cc {
static Scanner sc=new Scanner(System.in);

cc(){
System.out.println("default constructor");
}

cc(int i)
{
System.out.println(i);
cc d=new cc();
}

cc(float f,String s)
{
System.out.println(f);
System.out.println(s);
cc si=new cc(sc.nextInt());
}

public static void main(String[] args) {

cc do=new cc(sc.nextFloat(),sc.next());

}
}