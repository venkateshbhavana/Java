/*
 * Have the function MatrixChallenge(strArr) read the array of strings stored in strArr which will
represent a 2D N matrix, and your program should return the elements after printing them in an
anti-clockwise, spiral order. You should return the newly formed list of elements as a string with
the numbers separated by commas. For example: if strArr is "[1, 2, 3]", "[4, 5, 6]", "[7, 8, 9,]" then
this looks like the following 2D matrix:

1 2 3

4 5 6

7 8 9

So your program should return the elements
of this matrix in an anti-clockwise, spiral order which is: 3, 2, 1, 4, 7, 8, 9, 6, 5.
 */


package TArrays;
import java.util.*;
public class a14 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]={"[18,22,34]","[42,51,67]","[74,80,89]"};
        
        int r = s.length; 
        String[][] s1 = new String[r][]; // Jagged array

        
        for (int i = 0; i < r; i++) {
            s[i] = s[i].replace("[", "").replace("]", ""); 
            s1[i] = s[i].split(","); 
        }
         String re="";
         int r1=0,r2=r-1,c1=0,c2=s1[0].length - 1,count=0;
         while(r2>=r1 && c2>=c1)  // or r1<=r2 && c1<=c2
         {
             for(int i=c2;i>=c1;i--)
             {
                re=re+(s1[r1][i]+",");
                 
             }
             r1++;
             for(int i=r1;i<=r2;i++)
             {
                 re=re+(s1[i][c1]+",");
             }
             c1++;
             for(int i=c1;i<=c2;i++)
             {
                re=re+(s1[r2][i]+",");
             }
             r2--;
             for(int i=r2;i>=r1;i--)
             {
                re=re+(s1[i][c2]+",");
             }
             c2--;
         }
        re=re.substring(0,re.length()-1)+".";
        System.out.println(re);
    }
}
