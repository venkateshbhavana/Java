/*Description:
(6.in strings exam)Write a Program to print all the Prime Numbers which are present in a Given String?


Constraints:
Input :             First line of the input consists of a String.

Output :          Print all Prime Numbers in given String


Example:
Input 1 :           new int[]{10, 20, 3, 5, 1, 11 };

Output 1 :        3

                         5

                         11

 

Input 2 :            new int[]{25, 34, 45, 8, 9, 66, 91, 13, 17, 97 };

Output 2 :         17 

                          97


Explanation:
Input 1 :           new int[]{10, 20, 3, 5, 1, 11 };

Output 1 :        3

                         5

                         11

Explanation :

10 is not a Prime Number

20 is not a Prime Number

3 is a Prime Number

5 is a Prime Number

1 is not a Prime Number

11 is a Prime Number

 

Input 2 :            new int[]{25, 34, 45, 8, 9, 66, 91, 13, 17, 97 };

Output 2 :         13

                           17 

                           97

Explanation :

25 is not a Prime Number

34 is not a Prime Number

45 is not a Prime Number

8 is not a Prime Number

9 is not a Prime Number

66 is not a Prime Number

91 is not a Prime Number

13 is a Prime Number

17 is a Prime Number

97 is a Prime Number
 */
package Strings;
import java.util.*;
public class s62 {
    static boolean isPrime(String s)
    {
        int n=Integer.parseInt(s);
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=s.indexOf('{');
        int l=s.indexOf('}');
        s=s.substring(k+1,l);
        String a[]=s.split(", ");
        for(int i=0;i<a.length;i++)
        {
            if(isPrime(a[i]))
            {
                System.out.println(a[i]);
            }
        }
    }
}
