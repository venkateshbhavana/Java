package TArrays;

import java.util.*;
public class a22
{
    static boolean isPossible(char ch1,char ch2)
    {
        int k1=Integer.parseInt(ch1+"");
        int k2=Integer.parseInt(ch2+"");
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r=a.length;
        int c=a[0].length;
        int i;
        for(i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==k1)
                {
                    //left
                    if(j>0 && a[i][j-1]==k2)
                        return true;
                    //right
                    if(j<c-1 && a[i][j+1]==k2)
                        return true;
                    //top
                    if(i>0 && a[i-1][j]==k2)
                        return true;
                    //bottom
                    if(i<r-1 && a[i+1][j]==k2)
                        return true;
                    //left-top-diagonal
                    if(i>0 && j>0 && a[i-1][j-1]==k2)
                        return true;
                    //right-top-diagonal
                    if(i>0 && j<c-1 && a[i-1][j+1]==k2)
                        return true;
                    //left-bottom-diagonal
                    if(i<r-1 && j>0 && a[i+1][j-1]==k2)
                        return true;
                    //right-bottom-diagonal
                    if(i<r-1 && j<c-1 && a[i+1][j+1]==k2)
                        return true;
                }
            }
        }
        return i!=r;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i;
		for(i=0;i<s.length()-1;)
		{
		    char ch1=s.charAt(i);
		    char ch2=s.charAt(i+1);
		    if(isPossible(ch1,ch2))
		        i++;
		    else{
		        System.out.println("INVALID");
		        break;
		    }
		}
		if(i==s.length()-1)
		{
		    System.out.println("VALID");
		}
	}
}
