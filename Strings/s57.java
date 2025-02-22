package Strings;
import java.util.*;
public class s57 {
    static boolean unique(String k)
    {
        int n=k.length();
        for(int i=0;i<k.length();i++)
        {
            char ch=k.charAt(i);
            if(k.indexOf(ch)!=k.lastIndexOf(ch))
            return false;
            
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
         int h=2;
         String result="";
        for(int i=0;i<n;i++)
        {
           for(int j=i;j<n;j++)
           {
             String k=s.substring(i, j+1);
             if(unique(k))
             {
                if(k.length()>h)
                {
                    h=k.length();
                    result=k+"\n";// \n uses because of store every string in next line
                }
                else if(k.length()==h)
                result=result+k+"\n";

             }
           }
        }
        System.out.println(result);
    }
}
