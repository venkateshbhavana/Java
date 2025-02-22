// written in notes.

package Strings;
import java.util.*;
public class s58 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
		String f[]=s.split(" ");
		String z="";
		int max=Integer.MAX_VALUE;
		for(int i=0;i<f.length;i++)
		{
		    if(f[i].length()<max)
		    {
		        z=f[i];
		        max=f[i].length();
		    }
		}
		String l="";
		int i;
		for(i=0;i<max;)
		{
		    char ch=z.charAt(i);
		    int j;
		    for(j=0;j<f.length;)
		    {
		        if(f[j].charAt(i)==ch)
		        {
		            j++;
		        }
		        else
		            break;
		    }
		    if(j==f.length)
		    {
		        l+=ch;
		        i++;
		    }
		    else
		        break;
		}
		if(!(l.isEmpty()))
		{
		    System.out.println(l);
		}
		else
		{
		    System.out.println("NOT FOUND");
		}
}
}