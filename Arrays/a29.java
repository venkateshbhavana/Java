/* 3.	Input: 84, Output: {1,0,1,0,1,0,0}. Decimal to Binary conversion. */

package Arrays;

import java.util.*;

public class a29 {

    static int[] decbin(int n)
    {
        int t=n;
        String b="";
        while(t!=0)
        {
          int r=t%2;
          b=(r)+b; // b=(char)(r)+b;
          t/=2;
          
        }
        int l=b.length();
      int a[]=new int[l];
      for(int i=0;i<l;i++)
      {
        a[i]=b.charAt(i)-48; /*if 1 is remainder it store as 49(ascii value) in a[] so done -48. */// OR a[i]=b.charAt(i) /*if we not done -48 also because of tostring method it automaticaly print original char values */
      }
      return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // System.out.println(decbin(n)); dont print array like this it will print array address.
       int a[]=decbin(n);
        System.out.println(Arrays.toString(a));/* if we use "b=(char)(r)+b" Arrays.toString method implicitly converted back into a character string print as it is character values present in string b*/
        
    }
}
