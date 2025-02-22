//convert given 3 digit 567 into 5+6+7=18 as output.
import java.util.*;
public class o3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n%10;
        int q=n/10;
        int sum=r;
        r=q%10;
        q=q/10;
        sum=sum+r;
        r=q%10;
        q=q/10;
        sum=sum+r;
        System.out.println(sum);
    }
}
