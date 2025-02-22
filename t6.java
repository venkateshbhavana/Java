import java.util.*;

class A extends Thread
{
    public void run() 
    {
        for(int i=1;i<=10;i++)
        {
           System.out.println(i);
           try{ /* actully exception didnt raises maximum due to checked exception we write try catch block we didnt write throws beside run method because run is overridden method if we use throw there run method didnt override it again error occures so use trry catch.*/ 
            Thread.sleep(3000); // sleep is a static method so we invoke using Thread class.
           }
           catch(InterruptedException e){
           System.out.println(e);  // exception not raised so obj not printed in output.
           }        
        }
    }
  public static void main(String[] args) 
  {
     A t1=new A();
     t1.start();
     
     System.out.println("Done");
  }
}
     