class R{

  public static void main(String [] args){
 
   Runnable r=new Runnable(){
     public void run(){ 
    System.out.println("run");
    }
  };
   Thread t=new Thread(r);
     t.start();
   
   /* Runnable r1=()-> ;
    Thread t2=new Thread(r1);
        t2.start(); */
      
   new Thread(()->{ System.out.println("run1"); }).start();






  }
}