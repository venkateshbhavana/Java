/*Question 1:
Marks: +10-0
Description:
Write a program to count the occurrence (frequency) of all elements in an array and print the odd frequency of elements in decreasing order and then print the even frequency of elements in increasing order?

Segregate the odd and even frequency seperately and arrange the odd frequency elements in decreasing order and arrange the even frequency elements in increasing order 

Input :                 First line consists of One integer value represents Array Size.

                            Second line consists of Array Elements in unsorted order

Output :              print the odd frequency of elements in decreasing order and then print the even frequency of elements in increasing order


Constraints:
Array size must be greater than zero or else print "Invalid Input"


Example:
Input 1 :         15

                        10 12 10 22 10 18 15 22 10 22 18 18 12 10 22

Output 1 :

10 - 5

18 - 3

15 - 1

12 - 2

22 - 4

Input 1 :         10

                       93 36 72 36 93 72 93 36 93 93

Output 1 :

93 - 5

36 - 3

72 - 2 */

package Strings;
import java.util.*;
public class s69
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.print("Invalid Input");
            return;
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        int b[]=new int[n];
        int h=0;
        for(int i=0;i<n;i++)
        {
            int oc=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                oc++;
            }
            b[i]=oc;
            
        }
        
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(b[j]<b[j+1])
                {
                    b[j]=b[j]+b[j+1]-(b[j+1]=b[j]);
                    a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
                }
            }
        }
        String s="";
        
        for(int i=0;i<n;i=i+b[i])
        {
            if(b[i]%2==1)
            System.out.println(a[i]+" - "+b[i]);
            
        }
        for(int i=n-1;i>=0;i=i-b[i])
        {
            if(b[i]%2==0)
            System.out.println(a[i]+" - "+b[i]);
            
        }
    }
}