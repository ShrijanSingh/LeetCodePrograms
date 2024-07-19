package LeetCode;
import java.util.Scanner;
public class BottleExchange {
    public static void main(String[] args) {
int org;
    int n=9;
    org=n;
    int m=3;
    int sum=0;
    while (n>=m)
    {
        sum+=n/m;
        n=n/m + n%m;
    }
    System.out.println("Result"+(sum+org));
}
}