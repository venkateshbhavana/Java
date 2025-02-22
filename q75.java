//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
 
class OddNumberException extends Exception
{
   public OddNumberException(String msg)
   {
      super(msg);
   }
}
class Exception_OddNumber {
  public static void main(String[] args) throws Exception {
    int n = 18;
    trynumber(n);
    n = 7;
    trynumber(n);
  }

  public static void trynumber(int n) throws Exception {
    try {
      checkEvenNumber(n);
      System.out.println(n + " is even.");
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
      System.out.println(e);
    }
  }

  public static void checkEvenNumber(int number) throws Exception{
    if (number % 2 != 0) {
      throw new OddNumberException(number + " is odd.");/* we can give any Exception name here which is already present in exception class.*/
    }
  }
}