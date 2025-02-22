abstract  class E{
static java.util.Scanner sc=new java.util.Scanner(System.in);
   abstract int m1(String a);
   abstract float m2(long a);
   double m3(char a){
   System.out.println(a);
   return sc.nextDouble();
  }
}
abstract class T extends E{
    T(String a){  /* if constructor there in base abstract class we must call this constructor under derived or concrete class in another constructor using super keyword otherwise error occures.*/
    System.out.println(a);
   }
  abstract boolean m4(int a);
   long m5(String a){
   System.out.println(a);
    return sc.nextLong();
  }

}
class Test extends T{
    Test(){
     super(sc.next());
   }
   int m1(String a){
    System.out.println(a);
   return sc.nextInt();
  }
   float m2(long a){
  System.out.println(a);
   return sc.nextFloat();
  }
  boolean m4(int a){
    System.out.println(a);
   return sc.nextBoolean();
  }
  public static void main(String [] args){
     Test t=new Test(); 

/*here only one object is enough  to print all methoed becaues  we created object for bottom most derived class and method names for class to class is different so we use same object otherwise if same methods are there we create particular class object to print that class method.  */

      System.out.println(t.m1(sc.next()));
     System.out.println(t.m2(sc.nextLong()));
    System.out.println(t.m3(sc.next().charAt(0)));
   System.out.println(t.m4(sc.nextInt()));
  System.out.println(t.m5(sc.next()));


  }
}











  
  