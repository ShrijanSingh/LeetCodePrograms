package LeetCode;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        String s="aacc";
        String t="ccac";
        int count=0;
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        for (int i=0;i<s1.length;i++)
        {
            // for (int j=0;j<t1.length;j++)
            // {
            //     if (s1[i]==t1[j])
            //     {
            //         count++;
            //         t1[j]='1';
            //         break;
            //     }
            // }
        }
        if (count==s.length() && s.length()==t.length())
        System.out.println("true");
        else
        System.out.println("false");
    }
}
