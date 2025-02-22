package Strings;
import java.util.*;
public class s37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="ravi ramu sai ravi nani kiran nani siri nani";
        String a[]=s.split(" ");
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int oc=0;
            for(int j=0;j<n;j++)
            {
                if(a[i].equals(a[j]))
                {
                    oc++;
                    
                }
            }
                
               int lc=0;
                for(int j=0;j<=i;j++)
                {
                    if(a[i].equals(a[j]))
                    lc++;
                }
                if(lc==1)
                System.out.println(a[i]+" -> "+oc);
                
                
            
        }

    }
}
