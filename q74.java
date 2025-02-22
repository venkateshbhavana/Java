import java.io.*;  //ee io package lo

class ThrowsE
{
  
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
       FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Desktop\\CVCorp-JAVA\\Throws.txt"); 
       System.out.println(f.read());
       System.out.println("Done");
    }
}  