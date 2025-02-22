package Strings;
import java.util.*;
public class s571 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
         int maxLength=0;
         String t="";
         String k="";
        for(int i=0;i<n;i++)
        {
             char ch=s.charAt(i);
             if((t.contains(ch+"")))
             {
                t=t.substring(t.indexOf(ch)+1);
             }
             t=t+ch;
             if (t.length() > maxLength) {
                maxLength = t.length();
                k = t + "\n"; // Replace result with the new longest substring
            }
            // If 't' has the same length as the maxLength, append it to result
            else if (t.length() == maxLength) {
                k += t + "\n";
            }
                
        }
        System.out.println(k);  

    }       
}
