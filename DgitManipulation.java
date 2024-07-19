package LeetCode;
import java.util.*;
public class DgitManipulation{
    public static int[] plusOne(int[] digits) {
       int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // digits[i] = 0; 
        }
        int[] result = new int[n + 1];
        result[0] = 1; 
        return result;
    }
    public static void main(String[] args) {
int digits[]={8,9,9,9};
       int res[]= plusOne(digits);
       for (int i=0;i<res.length;i++)
       System.out.println(res[i]);

    }
} 