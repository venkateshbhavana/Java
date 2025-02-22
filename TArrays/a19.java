

package TArrays;

import java.util.Arrays;
import java.util.Scanner;

class a19
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++)
        {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}