                      //ANONYMOUS INNER CLASS

/*  Create a Java application where we have 1 abstract class and 1 interface with individual abstract methods having parameter and return type. Then provide implementation for this by using anonymous Inner Class. */
/*
import java.util.*;
abstract class A
{
  static Scanner sc=new Scanner(System.in);
   abstract String m1(float a);
  public static void main(String[] args)
  {
      A o1=new A()
     {
       String m1(float a)
        {
          System.out.println(a);
          return sc.next();
       }
    };

    System.out.print(o1.m1(A.sc.nextFloat()));
  }
}

interface B{
 B o2=new B(){
       public int m2(boolean a)
         {
         System.out.println(a);
         return A.sc.nextInt();
         }

     };
      int m2(boolean a);
     public static void main(String[] args)
     {

      System.out.print(o2.m2(A.sc.nextBoolean()));
     }
}
    
*/

 
   
/* if we want execute tw0 main methods by calling only 1 class or interface B we can write below code*/

import java.util.*;
abstract class A
{
  static Scanner sc=new Scanner(System.in);
   abstract String m1(float a);
  
}

interface B{
  B o2=new B(){  // no need to put static to access in main method because in interfaces properties are by dedault static
       public int m2(boolean a)
         {
         System.out.println(a);
         return A.sc.nextInt();
         }

     };
      int m2(boolean a);
     public static void main(String[] args)
     {
        A o1=new A()
         {
             String m1(float a)
             {
             System.out.println(a);
             return sc.next();
             }
         };
      System.out.println(o1.m1(A.sc.nextFloat()));
      System.out.println(o2.m2(A.sc.nextBoolean()));
     }
}



/*  SIR EXPLAINED CODE
abstract class A{
    static java.util.Scanner sc=new java.util.Scanner(System.in);
     int m1(long a){
      System.out.println(a);
     return sc.nextInt();
    }
   abstract String m2(Boolean a);
}
interface I3{
    double m3(short a);
}
class Test{
     static A obj=new A(){//this inner class is derived class of A.here we are putting static beside because of to access this anonymouse class inside main method.
      String m2(Boolean a){
         System.out.println(a);
         return sc.next(); // here we no need to put A. because this inner class extends A class so no need.
     }
   };
     
   public static void main(String [] args){
       System.out.println(obj.m1(A.sc.nextLong()));
       System.out.println(obj.m2(A.sc.nextBoolean()));
       I3 a2=new I3(){
            public double m3(short a){
              System.out.println(a);
               return A.sc.nextDouble();
           }
      };
       System.out.println(a2.m3(A.sc.nextShort()));

  }
}

*/