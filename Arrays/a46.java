package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a46 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        int z=0;
        int w=0;
        for(int i=0;i<n;i++)
        {
            int min=a[i];
            int c=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]==min+1)
                {
                    c++;
                    min=a[j];
                }
                else
                {
                    break;
                }
            }
            if(c>z)
            {
                z=c;
                w=i;
            }
        }
        //System.out.println(z);
        //System.out.println(w);
        for(int i=w;i<z+w;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
