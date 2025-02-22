package p1;

import java.util.*;
public class AM1
{
    public long m4(double a)
    {
       System.out.println(a);
       AM o1=new AM();
       System.out.println(o1.m1(AM.sc.next()));
       System.out.println(o1.m2(AM.sc.nextBoolean()));
       return AM.sc.nextLong();
    }
}