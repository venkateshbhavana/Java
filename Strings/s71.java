package Strings;

import java.util.Scanner;

public class s71 {
    static boolean m2(String s,String r)
    {
        
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        if(!(r.contains(ch+"")))
        return false;
       }
       return true;

    }
    static boolean m1(String s)
    {
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";
        
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        if(r1.contains(ch+""))
        {
            
            return m2(s,r1);
        }
        else if(r2.contains(ch+""))
        {
            return m2(s,r2);
        }
        else if(r3.contains(ch+""))
        {
            return m2(s,r3);
        }
        
       }
       return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s[]=s1.split(" ");
        int n1=s.length;
        

        for(int i=0;i<n1;i++)
        {
            if(m1(s[i]))
            System.out.print(s[i]+" ");
        }
}
}