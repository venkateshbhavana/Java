class E
{
    public static void main(String args[])
    {
        String num1= args[0];  /* we use command line argument here because of args[] dont have any values so java E 10 20 at run time only we should provide values to skip errors. */ 
        String num2= args[1];
 
     /*String num1="10";
     String num2="k";     if we this initialisation no need to give input at commond line */

     try{
      int a =Integer.parseInt(num1);
      int b =Integer.parseInt(num2);
      System.out.println(a+b);
     }
     catch(NumberFormatException e){
      //System.out.println(e); /* uses for prints Exception name and nature of exception*/

     // System.out.println(e.getMessage()); /* use for printing nature of exception*/

      e.printStackTrace(); /* use for printing exception name, nature of exception, line number of exception . and this is void method no need to use println() */
     }
  
           System.out.println("Done");
   }
}