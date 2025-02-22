class D{
    
   D(){
    System.out.println("default");
  }
  D(int a){
   D a1=new D();
   System.out.println(a);
  }
  D(double a,String b){
   System.out.println(a+" "+b);
   D a2=new D(10);
  }
  public static void main(String []args){
    D a3=new D(12.3,"james");
     }
}
     