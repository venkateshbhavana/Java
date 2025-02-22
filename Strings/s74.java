
package Strings;

import java.util.*;
public class s74 {
	public static void main(String[] args) {
		String s="!@#$Hi@$.,Hello,.!..Sir@#..*";
		String a="";
		int i=0,c=0;
		while(i<s.length())
		{
		    char ch=s.charAt(i++);
		    if(Character.isLetterOrDigit(ch)){
		        a=a+ch;
		        break;
		    }
		    a=a+ch;
		}
		while(i<s.length()) {
			char ch=s.charAt(i++);
			if((ch>='a' && ch<='z' )||( ch>='A' && ch<='Z')) {
				if(c>0) {
					a=a+" ";
					c=0;
				}
				a=a+ch;
			}
			else {
				c++;
			}
		}
		if (c > 0) {
            a = a + s.substring(i-c);
        }
		System.out.println(a);
	}

}