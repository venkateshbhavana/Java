import java.util.*;
class chw6{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
       int h=(a > b) ? 
                      (a > c ? 
                       (a > d ? 
                        (a > e ? a : e) 
                        : (d > e ? d : e)) 
                       : (c > d ? 
                          (c > e ? c : e) 
                          : (d > e ? d : e))) 
                      : (b > c ? 
                         (b > d ? 
                          (b > e ? b : e) 
                          : (d > e ? d : e)) 
                         : (c > d ? 
                            (c > e ? c : e) 
                            : (d > e ? d : e)));
                            System.out.print(h);
        
    }
}