/*Description:
Write a program to print the Nearest fibonacci Values of a Given Array Elements?


Constraints:
Input :               First line consists of one integer value represents Array Size.

                          Second line consists of Array values.

Output :            Print the nearest fibnoacci value for Array Elements.

Constraints :     Given array size must be positive or else print "Invalid Array Size".


Example:
Input 1 :         5

                        4 5 6 8 17

Output 1 :       3 5
                        3
                        5
                        5
                        13 21

 

Input 2 :          5

                        0 1 2 3 5                         

Output 2:        1

                        0 1

                        1 3

                        2

                        3   */
import java.util.*;
public class chw29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int g=a[i],bf=0,af=0;
            int a1=0,b=1;
            while(true)
            {
                if(b>g)
                {
                    bf=a1;
                    af=b;
                    break;
                }
                int c=a1+b;
                a1=b;
                b=c;
            }
            if(a1==g)
            {
                bf=b-a1;
            }
            int ad=af-g;
            int bd=g-bf;
            if(ad==bd)
            {
                System.out.println(bf+" "+af);
            }
            else if(ad<bd)
            {
                System.out.println(af);
            }
            else
            {
                System.out.println(bf);
            }
        }
    }
}
