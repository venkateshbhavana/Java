/* 3.Create a java application where we have one class like RBI having one private variable like pin initialize this variable using a constructor and provide getter method. We have two abstract methods like withdraw and deposit having respective parameters and return types. Inherit this class into a concrete class like Bank and override the abstract methods and provide respective logics. We have one separate class like User having a static method like login method having pin to login as parameter and returns nothing. If the entered pin matches with original pin then invoke withdraw or deposit method based on the user choice. Invoke this method under main method by providing dynamic inputs*/

import java.util.*;

class RBI
{
   static Scanner sc=new Scanner(System.in);
   static float balance=5000;
   
   private int pin;
   RBI(int p)
   {
      pin=p;
   }
  
   int getter()
   {
       return pin;
   }
}

abstract class B
{
   abstract String withdraw(float a);

   abstract String deposit(float a);

}

class Bank extends B
{

    String withdraw(float a)
    {
      String s="";
       if(a<RBI.balance && a>=100)
       {
          RBI.balance=RBI.balance-a;
          s=s+(RBI.balance+"");
       }
       else
       {
          
          s="Unable to WithDraw ";
       }
        return s;
    }

    String deposit(float a)
    {
      String s="";
       if(a>=100)
       {
          RBI.balance=RBI.balance+a;
          s=s+(RBI.balance+"");
       }
       else
       {
          
          s="Unable to WithDraw ";
       }
        return s;
    }
} 

class User
{

    static Bank o2=new Bank();
    static void login(int p,int p1)
    {
       
        if(p==p1)
        {
           int option=RBI.sc.nextInt();
           if(option==1)
           {
             System.out.println(o2.withdraw(6000));
           }
           else if(option==2)
           {
              System.out.println(o2.deposit(1000));
           }
           else
           {
             System.out.println("Inalid Input");
           }
        }
    }

  public static void main(String[] args)
  {
        RBI o1=new RBI(RBI.sc.nextInt());
        int p1=o1.getter();
      System.out.println("Enter pin to Login: ");
      int a=RBI.sc.nextInt();
      login(a,p1);
  }
}









