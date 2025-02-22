/*Description:
Write a Program to print the Given Password is Valid Password or Not?


Constraints:
Input:             First Line of the Input Consists of String ( Represeents Name )

                       Second Line of the Input Consists of String ( Represents Password )

Output:         print Valid Password or Not a Valid Password.

Constraints:  

Password Must be consists of 8 Characters
Password Must be Starts with Capital Character
Password Must be consists of atleast one small Character
Password Must be consists of atleast one Special Character
Password Must be consists of atleast one Numerical Value
Password Must not be consists of Given Name ( Either Small or Capital Characters )
If Above constraints is not Satisfy then print Not a Valid Password or else if satisfies print Valid Password.


Example:
Example-1

Input:           Ramesh

                     fdgjkgdf

Output:        Not a Valid Password

 

Example-2

Input:          Kishore

                    Job@1234

Output:       Valid Password

 


Explanation:
Example-1

Input:           Ramesh

                     fdgjkgdf

Output:        Not a Valid Password

Explanation:

Given Password is Consists of all Small Characters, So Print "Not a Valid Password".

 

Example-2

Input:          Kishore

                    Job@1234

Output:       Valid Password

Explanation:

Given Password is Consists of Only 8 Character.

Given Password is Consists of One Captial Character.

Given Password is Consists of Two Small Characters.

Given Password is Consists of One Special Character.

Given Password is Consists of Four Numerical values.

Given Password doesn't Consists of Given Name, So Print "Valid Password".


Your Code: java */
import java.util.*;
class Main
{
public static void main(String[]args)
{

    Scanner sc=new Scanner(System.in);
    String t=sc.nextLine();
    String s=sc.nextLine();
    int n=s.length();
    if(n!=8)
    {
        System.out.println("Not a Valid Password");
    }
    else if(!(s.charAt(0)>='A' && s.charAt(0)<='Z'))
    {
        System.out.println("Not a Valid Password");
    }
    else if(s.contains(t))
    {
        System.out.println("Not a Valid Password");
    }
    else
    {
        int sm=0;
        int sp=0;
        int d=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                sm++;
            }
            else if(ch>='0' && ch<='9')
            {
                d++;
            }
            else 
            {
                sp++;
            }
        }
        if(sm!=0 && sp!=0 && d!=0)
        {
            System.out.println("Valid Password");
        }
        else
        {
            System.out.println("Not a Valid Password");
        }
    }


}
}