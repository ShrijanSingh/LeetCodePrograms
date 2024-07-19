package LeetCode;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String str[] = { "dog", "racecar", "car" };
        boolean flag = true;
        String ans = "";
        Arrays.sort(str);
        String comp = str[0];
        int j = 0;

        while (j < comp.length()) {
            for (int i = 1; i < str.length; i++) {
                if (str[i].charAt(j) != comp.charAt(j)) {
                    flag=false;
                    break;
                    
                }
            }
            if (flag) {
                ans += comp.charAt(j);
            }
            if (flag == false)
                break;
            j++;
        }
        System.out.println(ans);
    }
}
