/*1.	Write a program to covert temperature from degree C to F. (Input 80C) */

import java.util.Scanner;

class ctof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        // Use °F = (°C x 1.8) + 32
        float far = (c * 1.8f) + 32.0f;
        System.out.println(far);
    }
}