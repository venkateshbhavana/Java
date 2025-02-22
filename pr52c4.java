package main2;

import main1.*;
import main1.submain.*;

public class pr52c4 extends pr52c2 implements pr52c3
{
    public pr52c4()
    {
        super(pr52.sc.nextInt());
    }
    public int m2(String a)
    {
       System.out.println(a);
       return pr52.sc.nextInt();
    }
    public String m3(float a)
    {
         System.out.println(a);
       return pr52.sc.next();
    }
  
  public static void main(String[] args)
  {
     pr52 o1=new pr52(pr52.sc.nextBoolean());
       System.out.println(o1.m1(pr52.sc.nextFloat()));
      pr52c4 o2=new pr52c4();
    
       System.out.println(o2.m2(pr52.sc.next()));
       System.out.println(o2.m3(pr52.sc.nextFloat()));
   }
}

    
      