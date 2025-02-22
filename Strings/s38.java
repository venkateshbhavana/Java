package Strings;
import java.util.*;
public class s38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="malayalam";
        String c[]=s.split("");
        
        int n=c.length;
        for(int i=0;i<n;i++)
        {
            int oc=0;
            for(int j=0;j<n;j++)
            {
                if(c[i].equals(c[j]))
                oc++;
            }
            int lc=0;
                for(int j=0;j<=i;j++)
                {
                    if(c[i].equals(c[j]))
                    lc++;
                }
                if(lc==1)
                System.out.println(c[i]+" -> "+oc);
            
        }
        

    }
}
