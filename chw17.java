

import java.util.*;
public class chw17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        System.out.println(prime(n,i));
    }
    static boolean prime(int n,int i)
    {
        if(n<=2)
        {
            if(n==2)
            {
                return true;
            }
            else{
                return false;
            }
            
        }
        if(i==n)
        {
            return true;
        }
        if(n%i==0)
        {
            return false;
        }
        
            
           return prime(n,i+1);
        
    }
}
