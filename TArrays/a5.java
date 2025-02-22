package TArrays;
import java.util.*;
public class a5 {
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
        if(r!=c)
        {
            r=r+c-(c=r);
        }
        System.out.println("Transpose Matrix: ");
        for(int i=0;i<r;i++)
        {
            
            for(int j=0;j<c;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
