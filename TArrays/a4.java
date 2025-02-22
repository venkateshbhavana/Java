package TArrays;
import java.util.*;
public class a4 {
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
        int e=a[0][0];
        boolean b=true;
        ar:
        for(int i=0;i<r;i++)   
            {
                for(int j=0;j<c;j++)   
                {
                    // using single if loop if(0)
                    if(a[i][i]!=e)
                    {
                    b=!b;
                    break ar;
                    }
                    if(a[i][j]!=0 && i!=j)
                    {
                        b=!b;
                        break ar;
                    }
                }
                    
            }
            System.out.println(b);
            
    }
}
