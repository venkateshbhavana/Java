package Strings;

import java.util.Scanner;

public class s75 {
     static String m1(String l,String w,int in,String s,int a[])
    {
        int n=s.length(),c=0;
        while(s.contains(l))
        {
            s=s.replaceFirst(l,"");
            c++;
        }
        
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<w.length();j++)
            {
                char ch=w.charAt(j);
                if(s.contains(ch+""))
                s=s.replaceFirst(ch+"","");
            }
        }
        a[in]=c;
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        String a[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int f[]=new int[a.length];
        
        if(s.contains("z"))
        s=m1("z","zero",0,s,f);
        if(s.contains("w"))
        s=m1("w","two",2,s,f);
        if(s.contains("u"))
        s=m1("u","four",4,s,f);
        if(s.contains("x"))
        s=m1("x","six",6,s,f);
        if(s.contains("g"))
        s=m1("g","eight",8,s,f);
        if(s.contains("o"))
        s=m1("o","one",1,s,f);
        if(s.contains("t"))
        s=m1("t","three",3,s,f);
        if(s.contains("f"))
        s=m1("f","five",5,s,f);
        if(s.contains("s"))
        s=m1("s","seven",7,s,f);
        if(s.contains("i"))
        s=m1("i","nine",9,s,f);
        
        for(int i=0;i<10;i++)
        {
            if(f[i]!=0)
            System.out.println(a[i]+" - > "+f[i]);
        }
        
    }
}
