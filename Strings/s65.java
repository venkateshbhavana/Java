package Strings;
import java.util.*;
public class s65 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    s=s.replace(" ","");
    int n=s.length();
    int c=0,k=1;
    for(int i=0;i<n;i++)
    {
        System.out.print(s.charAt(i));
        c++;
        if(c==k)
        {
            System.out.println();
            k++;
            c=0;
        }

    }
}
}
