import java.util.*;
class chw5{
  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1,d=0,k=2,v=0;
        for(int i=2; ;i++)
        {
            int sq=(int)Math.sqrt(i);
            boolean f=true;
            for(int j=2;j<=sq;j++)
            {
                 if(i%j==0){
                     f=false;
                     break;
                 }
            }
            if(f)
            {
                d++;
                if(c==d)
                {
                    System.out.print(i+" ");
                    v++;
                    if(v==n)
                    {
                        break;
                    }
                    c=c+k++;
                }
                
            }
    
        }
       
        
    }
}