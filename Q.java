package q;

import p.*;// for accessing all properties in p package.

import p.p1.*;// for accessing all properties in p1 sub package.

public class Q extends L implements K,M,p.p1.p2.N,p.p1.p2.O  //i used fully qualified approach for p2 sub sub pakage.
{
   Q()
   {
      super(J.sc.nextBoolean());
   
     
   }
  
   public String m2(int a)
   {
      System.out.println(a);
      return J.sc.next();
   }
   public long m3(float a)
   {
      System.out.println(a);
      return J.sc.nextLong();
   }

      public char m4(long a)
      {
          System.out.println(a);
          return J.sc.next().charAt(0);
      }
 
     public float m6(int a)
     {
       System.out.println(a);
       return J.sc.nextFloat();
     }

     public int m7(float a)
     {
       System.out.println(a);
       return J.sc.nextInt();
     }
//sub-sub package functionality

     public String m8(long a)
     {
        System.out.println(a);
        return J.sc.next();
     }
     public long m9(float a)
     {
        System.out.println(a);
        return J.sc.nextLong();
     }

   public static void main(String[] args)
   {
      J o1=new J(J.sc.nextInt());  
      System.out.println(o1.m1(J.sc.nextFloat()));
      p.p1.p2.P o2=new p.p1.p2.P(J.sc.nextLong());  
      System.out.println(o2.m12(J.sc.nextFloat()));
     
      Q o3=new Q();
      System.out.println(o3.m2(J.sc.nextInt()));
      System.out.println(o3.m3(J.sc.nextFloat()));
      System.out.println(o3.m4(J.sc.nextLong()));
      System.out.println(o3.m5(J.sc.nextFloat()));
      System.out.println(o3.m6(J.sc.nextInt()));
      System.out.println(o3.m7(J.sc.nextFloat()));
      System.out.println(o3.m8(J.sc.nextLong()));
      System.out.println(o3.m9(J.sc.nextFloat()));
      System.out.println(o3.m10(J.sc.nextBoolean())); /*m10 and m11 are default methods in interface O so we can invoke directly through object. if we put defined method as static we must call p.p1.p2.O.m10(); because aa package lopala class vundi. */
      System.out.println(o3.m11(J.sc.nextFloat()));



   }

}