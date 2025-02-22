/*
Input 1  :    4

                  5

Output 1: 

50 
45 40 
35 30 25 
20 15 10 5 

Input 2  :    6  

                  4

Output 2: 

84 
80 76 
72 68 64 
60 56 52 48 
44 40 36 32 28 
24 20 16 12 8 4 



 */
 
 /* 
import java.util.*;
class chw22
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(n<=0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
             int l=0;
              
            for(int i=1;i<=n;i++)
            {
                  
                for(int j=1;j<=i;j++)
                {
                    l++;
                }
            }
            int p=k*l;
             
            for(int i=1;i<=n;i++)
            {
                  
                for(int j=1;j<=i;j++)
                {
                    
                    System.out.print(p+" ");
                        p-=k;
                    
                }
                System.out.println();
            }
        }
        
    }
}

*/

/*
Input 1  :    4

                  5

Output 1: 

50 
45 40 
35 30 25 
20 15 10 5 

Input 2  :    6  

                  4

Output 2: 

84 
80 76 
72 68 64 
60 56 52 48 
44 40 36 32 28 
24 20 16 12 8 4 



 */
 
 import java.util.*;
 class chw22
 {
     public static void main(String []args)
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int k=sc.nextInt();
         if(n<=0)
         {
             System.out.print("Invalid Input");
         }
         else
         {
              
             
             int p=((n*(n+1))/2)*k;  // sum of natural numbers * given k;
              
             for(int i=1;i<=n;i++)
             {
                   
                 for(int j=1;j<=i;j++)
                 {
                     
                     System.out.print(p+" ");
                         p-=k;
                     
                 }
                 System.out.println();
             }
         }
         
     }
 }