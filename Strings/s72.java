/*
 * Description:
Write a program to print the following Format.

 


Constraints:
Input :             First line consists of One String Value (Alpha-Numeric).

Output :          Print the output as given in Example.

Constraints :   Given String input must contain only alphabets and Numberic characters else print "Invalid Input".

                         If the given String doesn't contain any Numberic characters then print "No Numeric Characters".

                         


Example:
Input 1 :        progra22mm9

Output 1 :     p2r2o9g2r2a9m2m2
               p2r2o9g2r2a9m2m2

Input 2 :        jAvA334

Output 2 :     j3A3v4A3

Input 3 :        cvcorp

Output 3 :     No Numeric Characters
 */


package Strings;
import java.util.*;

public class s72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t="";
        String d="";
        int lc=0,dc=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(!(Character.isLetterOrDigit(ch)))
            {
                System.out.println("Invalid Input");
                return;
            }
            else if(Character.isLetter(ch))
            {
                lc++;
                 t=t+ch;
            }
            else if(Character.isDigit(ch))
            {
                dc++;
                     d=d+ch;
            }
        }
    if(dc==0)
    {
        System.out.println("No Numeric Characters");
        return;
    }
    else if(lc==0)
    {
        System.out.println("No Alpha Characters");
        return;
    }
        int tl=t.length();
        int dl=d.length();
        String r="";
        int i=0,j=0;
        //System.out.println(t);
        //System.out.println(d);
        while(i<tl && j<dl)
        {
            r=r+(t.charAt(i++))+(d.charAt(j++));
            
            if(j==dl)
            j=0;
        }
        System.out.println(r);
    }
}
