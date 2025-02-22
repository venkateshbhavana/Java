/*5.	Input: Character array {‘c’,’v’,’c’,’o’,’r’,’p’},
        output:1 (Number of vowels) */

package Arrays;

import java.util.Scanner;

public class a31 {
    static boolean isVowel(char n)
    {
        char c=Character.toLowerCase(n);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=0,num=0;
        char a[]=new char[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.next().charAt(0);
             if(!(Character.isLetter(a[i])))
             {
                num++;

             }
             if(isVowel(a[i]))
             {
                v++;
             }
        }
        System.out.println("Vowels in given array:-  "+v);
        System.out.println(" Numbers in given array:- "+num);
    }
}
