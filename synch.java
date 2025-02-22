                                  //SYNCHRONIZATION
class P{
   int i=0;
   synchronized void increment(){
    i++;
    System.out.print(i+" ");
  }
}
class T1 extends Thread{

  static P obj3;
   T1(P obj3){
    this.obj3=obj3;
   }
   
   public void run(){
      for(int i=1;i<=100;i++){
         obj3.increment();
      }
   }
}
class T2 extends Thread{

  static P obj3;
   T2(P obj3){
    this.obj3=obj3;
   }
   void m2(){System.out.println("m2"); }
   
   public void run(){
     m2();
      for(int i=1;i<=100;i++){
         obj3.increment();
      }
   }
}
class VK{

   public static void main(String [] args) throws Exception{
       P obj3=new P();
        T1 obj=new T1(obj3);T2 obj1=new T2(obj3);
       obj.start();
           obj1.start();
               obj1.join();
   //System.out.println(obj3.i);


   }
}























/*

class P{
   int i=0;
   synchronized void increment(){     // this is the resource method because each thread calls this method we use synchronized keyword as prefix because of to maintain concurrent execution  means executes 1 thread after another thread 1st prints 1 to 100 and then 2nd thread start printing 101 to 200. if we not use this sync.. concept randomly prints 1 to 200 
    i++;
    System.out.print(i+" ");
  }
}
class T1 extends Thread{

  static P obj3;
   T1(P obj3){
    this.obj3=obj3;
   }
  
   
   public void run(){
      for(int i=1;i<=100;i++){
         obj3.increment();
      }
   }
}
class T2 extends Thread{

  static P obj3;
   T2(P obj3){
    this.obj3=obj3;
   }


   void m2(){System.out.println("m2"); }
   
   public void run(){
     m2();       //m2 can print any where because we dont use syncronized concept here.
      for(int i=1;i<=100;i++){
         obj3.increment();
      }
   }
}
class VK{

   public static void main(String [] args) throws Exception{
       P obj3=new P();   // we have to take same objects for threads because of storing 1 to 200 in same object if we use different obj random numbers stored in random objs.
        T1 obj=new T1(obj3);
        T2 obj1=new T2(obj3);
       obj.start();   // manam 1st aa thread call cheste aa thread completely excecute avutadi after that any remaining thread can execute.
           obj1.start();
               obj1.join();  // here we used join because of to dont inturrept main thread execution.after thread 2 execution only main thread executed.
   //System.out.println(obj3.i);


   }
}

*/