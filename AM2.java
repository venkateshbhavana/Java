package p2;
import p1.*;
import java.util.*;
public class AM2 extends AM
{
   public static void main(String[] args)
   {
  
       AM2 o1=new AM2();
       System.out.println(o1.m1(AM.sc.next()));
       o1.m3();
       AM1 o2=new AM1();
       System.out.println(o2.m4(AM.sc.nextDouble()));
    }
    
}