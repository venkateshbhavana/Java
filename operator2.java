// convert the given 5620 seconds time into 1 hr 33 min 40 secs like this.
import java.util.Scanner;

public class operator2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int h=t/3600;
        int rt=t%3600;
        int m=rt/60;
        rt=rt%60;
        System.out.println(h+" hr "+m+" mins "+rt+" secs ");

    }
}
