import java.util.*;
class a44
{
    static int p(int n)
    {
        n=Math.abs(n);
        n=(int)Math.pow(n,2);
        return n;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<5)
        {
            System.out.print("Invalid Array Size");
            return;
        }
        
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       
      
       int c=0;
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               for(int k=j+1;k<n;k++)
               {
           if((p(a[i])+p(a[j]))==p(a[k]))
           {
               c++;
               System.out.print(a[i]+"*"+a[i]+" + "+a[j]+"*"+a[j]+" = "+a[k]+"*"+a[k]);
               
           }
           }
           }
       }
       if(c==0)
       {
           System.out.println(-1);
       }
       
       
        
    }
}