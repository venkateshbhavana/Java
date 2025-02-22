import java.util.*;

public class evenRec {
    
    static void  even(int a,int b)
    {
        if(b<a)
        {
            return;
        }
        
        if(b%2==0)
        {
            even(a,b-2);
            System.out.print(b+" ");
        }
        else{
            even(a,b-1);
        }
        //System.out.print(b+" ");
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	   even(a,b);
	}
}
