package LeetCode;
import java.util.Scanner;

public class Crawler {
    public static void main(String[] args) {
        int steps = 0;
        String logs[]={"/d", "/d"};
        for (String log : logs) {
            if (log.equals("../")) {
                if (steps > 0) {
                    steps--;
                }
            } else if (!log.equals("./")) {
                steps++;
            }
        }
        System.out.println("count: " + steps);
    }
}
