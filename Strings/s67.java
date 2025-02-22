package Strings;

import java.util.Scanner;

public class s67
{
	static boolean sort(String s,String t)
	{
		if(s.length()==t.length())
		{
			for(int i=0; i<s.length(); i++)
			{
				char ch=s.charAt(i);
				if(t.contains(ch+""))
					t=t.replaceFirst(ch+"","");
				else
					break;
			}
			return t.isEmpty();
		}
		else
			return false;
	}
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
		String s[]= new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next(); // dont use sc.nextLine() here it will take entire array elements as  s[0] element .
        }
		for(int i=0; i<s.length; i++)
		{
		     String t="";
			for(int j=i+1; j<s.length; j++)
			{
				if(!(s[j]=="") && sort(s[i],s[j]))
				{
				    t=t+s[j]+" ";
				    s[j]="";
				}
			}
			if(!t.isEmpty())
			{
			   System.out.println(s[i]+" "+t);
			}
		}
	}
}