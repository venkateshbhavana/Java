package Strings;

import java.util.Scanner;

import java.util.*;
public class s70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n1=s1.length();
        int n2=s2.length();
        int i=0,j=0;

        while(i<n1 && j<n2)
        {
            char ch1=s1.charAt(i);
           
                char ch2=s2.charAt(j);
                if(((ch1==ch2)))
                {
                   j++;
                }
                i++;
            }
            System.out.println(j==n2);
        }  

    }

