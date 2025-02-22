
//same s59  using selection sort

package Strings;
import java.util.*;
public class s60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //Komali sai lakshmi venu sravani teja mohana
        String a[]=s.split(" ");
        int l=0;

        for(int i=0;i<a.length-1;i++)
        {
            int e=a.length-i-1,k=0;
        for(int j=1;j<=e;j++)
        {
            if(a[j].length()>a[k].length())
            {
                k=j;
            }
        }
        String t=a[k];
                a[k]=a[e];
                a[e]=t;
        
    }
    for(String k:a)
    {
        System.out.print(k+" ");
    }
    }
}
