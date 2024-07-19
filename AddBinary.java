package LeetCode;
import java.util.Scanner;
public class AddBinary {
    public static void main(String[] args) {
        String a="1010";
        String b="1011";
    int x=toDecimal(a);
       int y=toDecimal(b);
    String c=addBinary(x,y);
    System.out.println("Answer="+ c);
    }
    public static int toDecimal(String a)
    {
        int base=1;
int x=Integer.parseInt(a);
int temp = x;
int dec_value=0;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
 
            dec_value += last_digit * base;
 
            base = base * 2;
        }
return dec_value;
}

public static String addBinary(int x,int y)
{
    int sum=x+y;
    String s=Integer.toBinaryString(sum);
    return s;
}
}


