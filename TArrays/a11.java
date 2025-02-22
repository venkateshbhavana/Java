package TArrays;
import java.util.*;
public class a11 {
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

        int r1=0,r2=r-1,c1=0,c2=c-1;
        while(c1<=c2)
        {
            for(int i=r2;i>=r1;i--)
            {
                System.out.print(a[i][c1]+" ");  
            }
            System.out.println();
            c1++;
            
        }
    }
}
