package Strings;
import java.util.*;
public class s66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2)
        {
            System.out.println("False");
            return;
        }
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(s2.contains(ch+""))
            {
                s2=s2.replaceFirst(ch+"","");
            }
        }
        System.out.println(s2.isEmpty());
    }
}
