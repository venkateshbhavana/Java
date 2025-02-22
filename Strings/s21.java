/* 21.	Write a Program to check/validate given String value is Valid Aadhar Number or not?
Input1:	439876875869
Ouput1:Valid Aadhar Number
Input2:	43@776875869
Ouput2:Not a Valid Aadhar Number
Input3:	jtniv9t349nc
Ouput3:Not a Valid Aadhar Number
Input4:	1234 5678 9101
Ouput4:Valid Aadhar Number
Input5:	1234567890123412
Ouput5:Not a Valid Aadhar Number
*/

package Strings;

import java.util.Scanner;

public class s21 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    if(s.length()!=12 && s.length()!=14)
    {
        System.out.println("Not a Valid Aadhar Number ");
        return;
    }
    
    int n=s.length();
    int i;
    for( i=0;i<n;i++)
    {
        char ch=s.charAt(i);
        if(s.length()==12 && !(ch>='0'&& ch<='9'))
        {
          break;
        }
        else if(s.length()==14)
        {
            if((i==4||i==9))
            {
            if(ch!=' ')
            break;
            }
            else{
                if(!(ch>='0'&& ch<='9'))
                break;
            }
        }
    }
    if(i==n)
    System.out.println("Valid Aadhar Number ");
    else
    System.out.println("Not a Valid Aadhar Number ");
    
   } 
}
