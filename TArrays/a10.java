package TArrays;
import java.util.*;
public class a10 {
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

        int r1=0,r2=r-1,c1=0,c2=c-1,count=1;
        while(r1<=r2 && c1<=c2)
        {
        for(int i=c1;i<=c2;i++)
        {
            a[r1][i]=count++;
        }
        r1++;
        for(int i=r1;i<=r2;i++)
        {
            a[i][c2]=count++;
        }
        c2--;
        for(int i=c2;i>=c1;i--)
        {
            a[r2][i]=count++;
        }
        r2--;
        for(int i=r2;i>=r1;i--)
        {
            a[i][c1]=count++;
        }
        c1++;
    }
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
       }
    }
}
