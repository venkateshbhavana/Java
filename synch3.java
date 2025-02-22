import java.util.*;                                 
class Bank 
{
   static float balance=0;
  void deposit(float a)
  {
      balance =balance+a;

     try
	{
        notify();     /* balance updated from 0 to 2000 so this method pullout thread2 from waiting state so t2 can withdraw. here we can observe that t2 is depending on t1. this is Called INTER THREAD COMMUNICATION CONCEPT. */
     }
     catch(Exception e)
     {
     }
  }
  
  void withdraw(float a)
  {
     if(a>balance)
     {
       System.out.println("Balance is less than amount");
       System.out.println("Waiting for deposit");
       try   //dont use throws exception instead of try and catch here because of we cannot override run method.
	{
            wait();
       }
       catch(Exception e)
       {
       }
    

    System.out.println("Withdraw Successfull");
    }

       // this 2 lines of code not executes until get out from waiting state.
  }

}
class T1 extends Thread
{

   static Bank obj3;
   T1(Bank obj3){
    this.obj3=obj3;
   }
   
   public void run()
   {
         obj3.withdraw(1000);
   }
}
class T2 extends Thread{

    static Bank obj3;
   T2(Bank obj3){
    this.obj3=obj3;
   }

    public void run(){
 
         obj3.deposit(2000);
         
   }
}

class cl{

   public static void main(String [] args) throws Exception{
       Bank obj3=new Bank();
       T1 t1=new T1(obj3);
       T2 t2=new T2(obj3);

           t1.start();
           t2.start();
           t2.join();
     

                System.out.println(obj3.balance); 
   }
}


