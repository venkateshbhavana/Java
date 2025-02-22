package te;
import java.util.*;
import t.*;
public class Bank
{
   
   static Scanner sc=new Scanner(System.in);
   float balance=2000;
   
  void withdraw(float amount) throws InsufficientFundsException
  {
    if(amount<balance)
    {
       System.out.println("Transation SuccessFull");
    }
    else
    {
        InsufficientFundsException obj=new InsufficientFundsException("WithDraw amount is greater than Balance...");
         throw obj;
    }

  }
  public static void main(String[] args) throws InsufficientFundsException
  {
       float amount =sc.nextFloat();
      new Bank().withdraw(amount);
  }
}