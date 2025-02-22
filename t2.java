//example of using factory method 

class A extends Thread{

  public void run(){
  Thread t2= Thread.currentThread();
   System.out.println(t2.getName()); // here it will print mythread because we are calling start() through t1 object t1 thread name is mythread. inside run method if we create any thread it print thread name as what we given in invoke start() method. 


  }

  public static void main(String[]args){
     Thread t2= Thread.currentThread();
  System.out.println(t2.getName());
    A t1=new A();
   t1.setName("mythread");
     t1.start();


     
  
  }
}