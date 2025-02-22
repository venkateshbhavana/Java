                                  
class P{
   static int i=0;
 static synchronized void increment(){
    i++;
    System.out.print(i+" ");
  }
}
class T1 extends Thread{
   
   public void run(){
      for(int i=1;i<=100;i++){
         P.increment();
      }
   }
}
class T2 extends Thread{

    public void run(){
     
      for(int i=1;i<=100;i++){
         P.increment();
      }
   }
}
class U{

   public static void main(String [] args) throws Exception{
       T1 t=new T1();
       T2 t1=new T2();
           t.start();
            t1.start();
             t1.join();
        System.out.println(P.i);
   }
}


