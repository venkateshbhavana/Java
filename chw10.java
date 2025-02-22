import java.util.*;
class chw10{
  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%9==0)
        {
            System.out.print(9);
            
        }
        else{
            System.out.print(n%9);
        }
    }
}