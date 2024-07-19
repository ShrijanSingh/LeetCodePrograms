package LeetCode;
import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        int org = x;
        x = Math.abs(x);
        System.out.println(x);
        int rev = 0;
        while (x > 0) {
            int rem = x % 10;
            // Check for overflow conditions before updating rev
            if (rev > (Integer.MAX_VALUE - rem) / 10) {
                rev = 0;
                break;
            }
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if (org < 0) {
            rev = rev * -1;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            System.out.println("result = 0");
        } else {
            System.out.println("result = " + rev);
        }
    }
}
