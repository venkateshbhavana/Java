/* create a java application where we have 1 class which contains default constructor , single parameterized constructor and double parameterized constructors then invoke default under single pc, single under double pc, double under main method by providing dynamic inputs.  */

import java.util.*;
class qc {
static Scanner sc=new Scanner(System.in);

qc(){
System.out.println("default constructor");
}

qc(int i)
{
System.out.println(i);
qc a=new qc();
}

qc(float f, String s)
{
System.out.println(f);
System.out.println(s);
qc a=new qc(sc.nextInt());
}

public static void main(String[] args) {

qc a=new qc(sc.nextFloat(),sc.next());

}
}