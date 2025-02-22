package TArrays;
import java.util.*;
public class a3 {
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

        for(int i=0;i<r;i++)
        {
            System.out.print(a[i][i]+" ");
        }
        System.out.println();
        for(int i=0;i<r;i++)   // i<c because of  row and column lengths equal in square 
            {
                    System.out.print(a[i][r-i-1]+" ");
            }
            System.out.println();
            for(int i=0;i<r;i++)   
            {
                    System.out.print(a[r-i-1][r-i-1]+" ");
            }
            System.out.println();
            for(int i=0;i<r;i++)    
            {
                    System.out.print(a[r-i-1][i]+" ");
            }
            System.out.println();
    }
}
