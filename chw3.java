/*
import java.util.*;
class chw3{
    
    static int reve(int n)
    {
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev*rev;
    }
    static int rev1(int n)
    {
        int p=n*n;
        int rev=0;
        while(p>0)
        {
            int r=p%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }
public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(rev1(n)==reve(n))
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        
    }
}
*/

import java.util.*;
class chw3{
    
    static int rev(int n)
    {
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n*n;
        a=rev(a);
        int b=rev(n);
         b=b*b;
        if(a==b)
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        
    }
}
