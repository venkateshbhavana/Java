import java.util.*;

class camma{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
int b=sc.nextInt();
int c=0;
for(int i=a;i<=b;i++)
{

if(i%11==0)
{
c++;
if(c>1)   //(c!=1)
{
System.out.print(",");
}
System.out.print(i);
}

}
System.out.println();
System.out.println(c);

}
}