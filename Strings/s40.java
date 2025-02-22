package Strings;
import java.util.*;
public class s40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="ab cd bc cd bc cd ab cd eg bc";
        String c[]=s.split(" ");
        int n=c.length;
        int b[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            int oc=0;
            for(int j=0;j<n;j++)
            {
                if(c[i].equals(c[j]))
                oc++;
            }
            b[i]=oc;
            
            
        }
    boolean k=true;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(b[j]<b[j+1])
                {
                    b[j]=b[j]+b[j+1]-(b[j+1]=b[j]);
                    String temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;

                    k=false;

                }
            }
            if(k)
            break;
        }

        for(int i=0;i<n;i=i+b[i])
        {
            System.out.println(c[i]+" -> "+b[i]);
        }
        

    }
}
