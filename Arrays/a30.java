package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class a30 {
    static int[] insertelement(int[] a, int k) {
        int n = a.length; 
        int[] b = new int[n + 1]; 

        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        b[n]=k;

        for(int i=0;i<n;i++)  //here b size is n+1 na thats why i taken upto i=n-1;
        {
            for(int j=i+1;j>=1;j--)
            {
                if(b[j-1]>b[j])
                {
                    b[j]=b[j]+b[j-1]-(b[j-1]=b[j]);
                }
                else{
                    break;
                }
            }
        }
        return b;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // Element to be inserted

        int[] result = insertelement(a, k);
        System.out.println(Arrays.toString(result));
    }
}
