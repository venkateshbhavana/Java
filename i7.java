abstract class R{
 abstract void m1();

}
interface I4{
    void m2();
}
class K {
   static class D extends R{    /* normal process for  inner class instead of anonymous inner .*/
          void m1(){
        System.out.println("m1");
        }
   }
   static class E implements I4{
     public void m2(){
       System.out.println("m2");
    }
  }
       

       public static void main(String [] args){
         R obj=new D();
           obj.m1();  // object creation and invoking for normal process.


        R obj1=new R(){  /* using anonumous inner syntax . always use this one instead of normal way to save time */
                  void m1(){
        System.out.println("m1");
        }
       };
       obj1.m1();

      I4 a2=new I4(){
        public void m2(){
       System.out.println("m2");
      }
    };
      new E().m2();
      a2.m2();



       


     
  }
}