package Arrays;
import java.util.*;
 class a14 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int x=0;x<n;x++)
        {
            a[x]=sc.nextInt();

        }
        int i=0,j=n-1;
        while(i<j)
        {
            if(a[i]%2==0 && a[j]%2==0)
            {
                a[i]=a[i]+a[j]-(a[j]=a[i]);
                i++;
                j--;
            }
            else{
                if(a[i]%2==1)
                {
                    i++;
                }
                if(a[j]%2==1)
                {
                    j--;
                }
            }
            
        }
        for(int x=0;x<n;x++)
        {
            System.out.print(a[x]+" ");

        }
         
    }
}
