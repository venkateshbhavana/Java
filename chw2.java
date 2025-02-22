import java.util.*;
class chw2{
public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int z=(Math.abs(a-b)+(a+b))/2;
        System.out.print(z);
    }
}