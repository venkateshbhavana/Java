package TArrays;
import java.util.*;
public class a2 {
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
       int k=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==k)
                {
                    System.out.println("Found");
                    return;
                }
               

            }
        }
        System.out.println("Not Found");
    }
}
