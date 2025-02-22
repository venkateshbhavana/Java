package Strings;
import java.util.*;
public class s42_43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S="ravi ramu sai ravi nani kiran nani siri nani";
        String a[]=S.split(" ");
        int n=a.length;
        int s=a[0].length();
        int h=0;
        String he="";
        String se="";
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
            if(oc==1)//finds unique words in string array
            {
                if(a[i].length()>h)
                {
                    h=a[i].length();
                    he=a[i];
                }
                if(a[i].length()<s)
                {
                    s=a[i].length();
                    se=a[i];
                }
            }
        }
        System.out.println(he+" -> "+h);
        System.out.println(se+" -> "+s);

    }
}
