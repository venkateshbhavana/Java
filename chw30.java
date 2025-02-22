

/*Description:
Write a Program to Print the Given Number is Circular Prime Or Not?


Constraints:
Input:               First line of the input Consists of One Integer Value.

Output:            Print the Given Number Circular Prime Or Not.

Constraints:    Given Input Must be Positive Number or else Print "Invalid Input".


Example:
Input 1:        31

Output 1:     Circular Prime

 

Input 2:        19

Output 2:     Not a Circular Prime

 

Input 3:        197

Output 3:     Circular Prime


Explanation:
Input 1:        31

Output 1:     Circular Prime

Explanation:

31--> By Using the Digits which are present in Given Number we can form a Numbers like 31 and 13,

13 and 31 are Prime Numbers so we Have to Print Circular Prime.

 

Input 2:        19

Output 2:     Not a Circular Prime

Explanation:

19--> By Using the Digits which are present in Given Number we can form a Numbers like 19 and 91,

19 is Prime Number and 91 is Not a Prime Number so we Have to Print Not a Circular Prime.

 

Input 3:        197

Output 3:     Circular Prime

Explanation:

197--> By Using the Digits which are present in Given Number we can form a Numbers like 197, 719 and 971.

197, 719 and 971 are Prime Numbers, so we Have to Print Circular Prime.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
        } else if (isCircularPrime(n)) {
            System.out.println("Circular Prime");
        } else {
            System.out.println("Not a Circular Prime");
        }
    }

    
    static boolean isPrime(int num) {
        if (num < 2) 
        return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
            return false;
        }
        return true;
    }

    static boolean isCircularPrime(int num) {
        String numStr = String.valueOf(num); 
        int len = numStr.length();

        for (int i = 0; i < len; i++) {
            if (!isPrime(Integer.parseInt(numStr))) {
                return false;
            }
            
            numStr = numStr.substring(1) + numStr.charAt(0);
        }

        return true;
    }
}

