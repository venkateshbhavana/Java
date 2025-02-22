package Strings;
import java.util.*;
public class s11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="{[()()]}";
       int n=s.length();
        for(int i=0;i<s.length()-1;i++)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            
            if((ch1=='[' && ch2==']') || (ch1=='(' && ch2==')') || (ch1=='{' && ch2=='}'))
            {
                s=s.replace(ch1+""+ch2,"");
                i=-1;
            }
        }
        if(s.isEmpty())
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}
