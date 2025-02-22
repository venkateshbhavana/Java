package Strings;
import java.util.*;
public class s59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //Komali sai lakshmi venu sravani teja mohana
        String a[]=s.split(" ");
        int l=0;

        for(int i=0;i<a.length-1;i++)
        {
            boolean b=true;
        for(int j=0;j<a.length-i-1;j++)
        {
            if(a[j].length()>a[j+1].length())
            {
                String t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
                b=false;
            }
        }
        if(b)
        {
            break;
        }
    }
    for(String k:a)
    {
        System.out.print(k+" ");
    }
    }
}
