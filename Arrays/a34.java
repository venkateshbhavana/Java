/*11.	Print the every Digit for Digit times in a increasing order of Digits in a given number?
Ex:- Input:- 250		output:- 2255555
Ex:- Input:- 251		output:- 12255555
Ex:- Input:- 4352		output:- 22333444455555
 */

 package Arrays;
import java.util.*;
public class a34 {

    static int num(int n)
    {
        int t=n;
        for(int i=1;i<t;i++)
        {
           n=n*10+t;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String result="";
        int t=n,c=0,i=0;
        while(t!=0)
        {
            int r=t%10;
            if(r!=0)
            {
              c++;
            }
            t/=10;
            
        }
        
        int a[]=new int[c];
        t=n;
        while(t>0)
        {
            int r=t%10;
            if(r!=0)
            {
            a[i++]=r;
            }
            t/=10;
            
        }
        Arrays.sort(a);
        for(int j=0;j<c;j++)
        {
            result=result+num(a[j]);
        }
        System.out.println(result);
    }
}


 /*without order  
package Arrays;
import java.util.*;
public class a34 {

    static int num(int n)
    {
        int t=n;
        for(int i=1;i<t;i++)
        {
           n=n*10+t;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String result="";
        int t=n;
        while(t!=0)
        {
            int r=t%10;
            if(r==0)
            {
               result =""+result;
            }
            else
            {
            result=num(r)+result;
            }
            t/=10;
            
        }
        System.out.println(result);
    }
}
*/

