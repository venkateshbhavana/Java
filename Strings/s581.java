package Strings;
import java.util.*;
class Main
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        
        String m="";
        String r="";
        
        
        for(int i=0;i<s[0].length();i++)
        {
            int c=0;
            m=m+s[0].charAt(i);
            int j;
            for( j=0;j<n;j++)
            {
                if(!s[j].startsWith(m))
                break;
            }
            if(j==n)
            r=m;
            else
            break;
        }
        if(r.isEmpty())
        {
            System.out.print("null");
        }
        else
        {
            System.out.print(r);
        }
    }
}

/*
 * OR
 * 
 * import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        String prefix = s[0]; // Start with the first string as the prefix.

        for (int i = 1; i < n; i++) {
            while (s[i].indexOf(prefix) != 0) {
                // Reduce the prefix length until it matches the start of the current string.
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.print("null");
                    return;
                }
            }
        }

        // If we reach here, 'prefix' is the longest common prefix.
        if (prefix.isEmpty()) {
            System.out.print("null");
        } else {
            System.out.print(prefix);
        }
    }
}

 */
