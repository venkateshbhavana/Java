package Strings;

import java.util.*;

public class s68 {
    static int sortm(String s) {
        String[] months = {"january", "february", "march", "april", "may", "june", 
                           "july", "august", "september", "october", "november", "december"};
        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(s)) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s[]=s1.split(" ");

        for (int i = 0; i < s.length-1; i++) {
            for (int j = 0; j < s.length - i - 1; j++) {
                
                int year1 = Integer.parseInt(s[j].substring(s[j].lastIndexOf('-') + 1));
                int year2 = Integer.parseInt(s[j + 1].substring(s[j + 1].lastIndexOf('-') + 1));

              
                String month1 = s[j].substring(3, s[j].lastIndexOf('-'));
                String month2 = s[j + 1].substring(3, s[j + 1].lastIndexOf('-'));

              
                int day1 = Integer.parseInt(s[j].substring(0, 2));
                int day2 = Integer.parseInt(s[j + 1].substring(0, 2));

            
                if (year1 > year2 || (year1 == year2 && sortm(month1) > sortm(month2)) ||
                    (year1 == year2 && sortm(month1) == sortm(month2) && day1 > day2)) {
                    
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

        for (String date : s) {
            System.out.println(date);
        }
    }
}



//{"03-september-2004", "10-july-2019", "29-august-2000","25-february-2019", "07-august-2000", "31-december-1995"}
