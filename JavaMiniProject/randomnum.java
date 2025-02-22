package JavaMiniProject;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class randomnum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        String s1="Arun",s2="arun";
        Random ran=new Random();
        num=ran.nextInt(100000);  //0-100000 any random number print in this range.
        System.out.println("Generated Random number: "+num);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //String Validation phone number
        String phone=sc.next();
        final String re="[6-9][0-9]{9}";
        boolean matches=false;
        matches=Pattern.matches(re,phone);
        if(matches)
        {
            System.out.println("Number Format is correct");
        }
        else{
            System.out.println("Number Format is Incorrect");
        }

        //Password
        String passwd = "aaZZa44@"; 
      String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
      System.out.println(passwd.matches(pattern));
    }

}
