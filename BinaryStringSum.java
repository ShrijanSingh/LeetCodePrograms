package LeetCode;
import java.util.Scanner;;
public class BinaryStringSum {
    public static void main(String[] args) {
        String x="11";
        String y="01";
        int num1 = Integer.parseInt(x, 2);
        // converting binary string into integer(decimal
        // number)
 
        int num2 = Integer.parseInt(y, 2);
        // converting binary string into integer(decimal
        // number)
 
        int sum = num1 + num2;
        // Adding those two decimal numbers and storing in
        // sum
 
        String result = Integer.toBinaryString(sum);
        System.out.println(result);
    }
}
