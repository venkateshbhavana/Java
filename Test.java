package test;
import q1.CR; // Cr,RD accessed thorogh normal import process.
import q1.RD;
public class Test extends RD implements CR,q1.q2.HR{ /*HR accesed throgh fully qualified approach. */

  public long m2(char a){
   System.out.println(a);
   return sc.nextLong();
  }
   Test(){
    super(sc.next());
   }
  public double m2(long a){
   System.out.println(a);
   return sc.nextDouble();
  }

  public float m4(long a){
    System.out.println(a);
   return sc.nextFloat();
  }




  public static void main(String [] args){
   System.out.println(CR.m1(sc.next()));
   Test t=new Test();
  System.out.println(t.m2(sc.next().charAt(0)));
 System.out.println(t.m2(sc.nextLong()));
  System.out.println(t.m3(sc.next()));
  System.out.println(t.m4(sc.nextLong()));
  System.out.println(t.m5(sc.nextDouble()));

   q1.q2.GG a1=new q1.q2.GG(sc.nextLong());
   System.out.println(a1.m6(sc.next()));
  

 

  }
}