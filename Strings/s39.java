package Strings;
import java.util.*;
public class s39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String a[]=s.split(" ");
        if(a.length==1)
        a=s.split("");
        
        int n=a.length;
        int h=1;
        String e="";
        for(int i=0;i<n;i++)
        {
            int oc=0;
            for(int j=0;j<n;j++)
            {
                if(a[i].equals(a[j]))
                {
                    oc++;
                    
                }
            }
            if(oc>h)
            {
                h=oc;
                e=a[i];
                
            }
        }
        System.out.println(e+" -> "+h);

    }
}
