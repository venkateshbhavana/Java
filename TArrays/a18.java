package TArrays;
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String kkk="";
        char arr[][] = new char[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=sc.next().charAt(0);
            }
        }
        int c=0;kkk="";
        for(int i=0;i<b;i++)
        {
            
            for(int j=0;j<a;j++)
            {
                if((arr[j][i]>='A'&&arr[j][i]<='Z')||(arr[j][i]>='a'&&arr[j][i]<='z')||(arr[j][i]>='0'&&arr[j][i]<='9'))
                {
                    if(c>0)
                    {
                        System.out.print(" ");
                        kkk="";
                        c=0;
                    }
                    System.out.print(arr[j][i]);
                }
                else
                {
                    c++;
                    kkk=kkk+arr[j][i];
                  
                }
            }
        }System.out.print(kkk);
    }
}