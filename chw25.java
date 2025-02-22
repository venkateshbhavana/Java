 import java.util.*;
 class nonprime {

    static boolean nonp(int k)
    {
        
        for(int i=2;i<=Math.sqrt(k);i++)
        {
            if(k%i==0)
            {
                return false;
            }
        }
        
            return true;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
               while(nonp(k))
               {
                k++;
               }
               System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
}
