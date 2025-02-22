//Print Non-Fibnacci numbers.

import java.util.*;
class chw27 {
    static boolean fib(int n)
    {
        int a=0,b=1;
         while(a<n)
         {
            
              int c=a+b;
              a=b;
              b=c;
         }
         if(a==n)
         {
            return true;
         }
         else{
            return false;
         }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int k=0;
          for(int i=1;i<=n;i++)
          {
            for(int j=1;j<=i;j++)
            {
              while(fib(k))
              {
                k++;
              }
              System.out.print(k+++" ");
            }
            System.out.println();
          }
    }
}
