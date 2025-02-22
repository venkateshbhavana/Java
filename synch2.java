                                  
class P {
   static float balance=0;
 static synchronized void deposit(float a){
      balance =balance+a;
    System.out.print(balance+" ");
  }
}
class T1 extends Thread{
   
   public void run()
   {
         P.deposit(1000);
   }
}
class T2 extends Thread{

    public void run(){
 
         P.deposit(2000);
 
   }
}
class T3 extends Thread{

    public void run(){
     
      P.deposit(3000);
   }
}
class T4 extends Thread{

    public void run(){
     
     P.deposit(4000);
   }
}
class T5 extends Thread{

    public void run(){
     
      P.deposit(5000);
   }
}
class cl{

   public static void main(String [] args) throws Exception{
       T1 t1=new T1();
       T2 t2=new T2();
       T3 t3=new T3();
       T4 t4=new T4();
       T5 t5=new T5();

           t1.start();
             t1.join();

           t2.start();
             t2.join();

           t3.start();
             t3.join();

           t4.start();
             t4.join();

           t5.start();
             t5.join();
        //System.out.println(P.balance);
   }
}


