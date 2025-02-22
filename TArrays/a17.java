package TArrays;

import java.util.Scanner;

class Solution {

    public static int islandPerimeter(int[][] a) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1) {
                    c += 4;  

                  
                    if (i > 0 && a[i - 1][j] == 1) {
                        c -= 1;
                    }
                   
                
                    if (i < a.length - 1 && a[i + 1][j] == 1) {
                        c -= 1;
                    }
                    
                  
                    if (j > 0 && a[i][j - 1] == 1) {
                        c -= 1;
                    }
                    
                    
                    if (j < a[i].length - 1 && a[i][j + 1] == 1) {
                        c -= 1;
                    }
                }
            }
        }
        return c;
    }
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
        System.out.println(islandPerimeter(a));
    }
}
