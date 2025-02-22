

/*Description:
Write a program to print the following pattern


Constraints:
Input             :  First line of input consists one integer value.

Output          :  Print the following pattern

Constraints  : NA 


Example:
Input  1  :  5

Output 1 : 

1
2 9
3 8 10
4 7 11 14
5 6 12 13 15

 

Input 2    : 7

Output 2 :

1
2 13
3 12 14
4 11 15 22
5 10 16 21 23
6 9 17 20 24 27
7 8 18 19 25 26 28 */
package Pattrens;

import java.util.*;
class A
{
public static void main(String []args)
{
	Scanner obj=new Scanner(System.in);

	int n=obj.nextInt();
	int p=1,d1=(2*n)-1, d2=-2;
	for(int i=1;i<=n;i++)
	{
		p=i;
		int d=d2;
		for(int j=1;j<=i;j++)
		{
			System.out.print(p+" ");
			if(j%2==1)
				p=p+d1;
			else
			{
				p=p+d;
				d-=4;
			}
		}
		d1-=2;
		d2+=2;
		System.out.println();
	}



}
}
