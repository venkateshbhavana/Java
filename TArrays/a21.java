package TArrays;
import java.util.*;
public class a21 {
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
        int h1=a[0][0];
        int h2=0;

        for(int i=0;i<r;i++)
        {
            
            for(int j=0;j<c;j++)
            {
                if(a[i][j]>h1)
                {
                    h2=h1;
                    h1=a[i][j];
                }
                else if(a[i][j]>h2 && a[i][j]<h1)
                {
                    h2=a[i][j];
                }

            }
        }
        System.out.println(h2);
    }
}
