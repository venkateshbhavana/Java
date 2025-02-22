package Strings;
import java.util.*;
class Solution {
    public static boolean isAnagram(String s, String t) {
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        s=String.copyValueOf(c1);
        t=String.copyValueOf(c2);

        return s.equals(t);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
