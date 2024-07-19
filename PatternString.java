package LeetCode;
import java.util.Scanner;
public class PatternString {
    public static void main(String[] args) {
        String haystack="leetcode";
        String needle="leet";
        if(haystack.contains(needle)){
        System.out.println(haystack.indexOf(needle));
        }
    }
}