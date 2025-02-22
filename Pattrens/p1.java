/*Description:
Write a Program to Print the Right Angle Triangle Program with Prime Numbers in Column WIse.


Constraints:
Input :             The First Line of the Input Consists of One Integer Value

Output :          Print the Pattern as Shown in the Pattern.

Constraints :   Given Number Must be Greater Than Zero or else Print "Invalid Input".


Example:
Input1 :       5

Output1 : 

2

3    13   

5    17   29

7    19   31   41

11  23   37   43   47

 

Input1 :       7

Output1 : 

2

3    19   

5    23   43

7    29   47   67 

11  31   53   71   83

13  37   59   73   89   101

17  41   61   79   97   103   107 */ 

package Pattrens;

import java.util.Scanner;

public class p1 {
    static int nth(int n)
    {
        int c=0;
        for(int i=2;;i++)
        {
            int j;
            for( j=2;j<i;j++)
            {
                if(i%j==0 &&(i!=2))
                {
                    break;
                }
            }
            if(j==i)
            {
                c++;
            }
            
            if(c==n)
            {
                return i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            int k=i;
            int d=n-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(nth(k)+" ");
                k=k+(d--);
            }
            System.out.println();
        }
    }
}
