//EXCEPTION HANDLING


import java.util.*;
class q70
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
      try{
       System.out.println(n/0);  //raising exception
       }
      catch(ArithmeticException e){
       System.out.println(e); 
       System.out.println(n/2); // handling exception code .
      }
        System.out.println("Done"); /*if we not write catch block after try block codes will not execute if exception raises. */

    }
}
