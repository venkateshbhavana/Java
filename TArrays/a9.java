package TArrays;
import java.util.*;
public class a9 {
    public static void main(String[] args) {
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

        int r1=0,r2=r-1,c1=0,c2=c-1,count=0;
        while(r2>=r1 && c2>=c1)
        {
            for(int i=c2;i>=c1;i--)
            {
                System.out.print(a[r1][i]+" ");
                
            }
            r1++;
            for(int i=r1;i<=r2;i++)
            {
                System.out.print(a[i][c1]+" ");
            }
            c1++;
            for(int i=c1;i<=c2;i++)
            {
                System.out.print(a[r2][i]+" ");
            }
            r2--;
            for(int i=r2;i>=r1;i--)
            {
                System.out.print(a[i][c2]+" ");
            }
            c2--;
        }
    }
}
