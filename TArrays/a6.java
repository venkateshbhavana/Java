package TArrays;
import java.util.*;
public class a6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();

        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        boolean b=true;
        ar:
        for(int i=0;i<r;i++)    
            {
                for(int j=0;j<c-1;j++)   
                {
                    if(a[i][j]!=a[i][j+1])
                    {
                    b=!b;
                    break ar;
                    }
                    
                }
                    
            }
            System.out.println(b);
            
    }
}
