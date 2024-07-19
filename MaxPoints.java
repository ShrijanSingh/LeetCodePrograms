package LeetCode;
import java.util.Scanner;

public class MaxPoints {
    public static void main(String[] args) {
        int x = 4, y = 5;
        String str = "cdbcbbaaabab";
        StringBuilder sb = new StringBuilder(str);
        int topscore = 0;
        int n = sb.length();

        // First, remove "ab" and add points for x
        for (int i = 0; i < n -1; i++) {
            if (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b') {
                topscore += x;
                sb.delete(i, i + 1);
                i = -1; // Reset to start the loop from the beginning
                n = sb.length(); // Update the length of sb
            }
        }

        // Then, remove "ba" and add points for y
        for (int i = 0; i < n -1; i++) {
            if (sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a') {
                topscore += y;
                sb.delete(i, i + 1);
                i = -1; // Reset to start the loop from the beginning
                n = sb.length(); // Update the length of sb
            }
        }

        System.out.println(topscore);
    }
}
