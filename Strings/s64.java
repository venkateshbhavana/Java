package Strings;
import java.util.*;
public class s64 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    s=s.replace(" ","");
    int n=s.length();
    for(int i=0;i<n;i++)
    {
        char ch=s.charAt(i);
        if((i+1)%3==0)
        System.out.println(ch);
        else
        System.out.print(ch);

    }
}
}
