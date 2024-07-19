package LeetCode;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class StringWork
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string length value");
        int nums1=sc.nextInt();
        String ar[]=new String[nums1];
        System.out.println("Enter the elements of the  string array");
        for (int i=0;i<nums1;i++)
        {
         ar[i]=sc.next();   
        }
String output[]=checkForValidity(ar);
for (int i=0;i<output.length;i++)
System.out.println(output[i]);
    }
    public static String[] checkForValidity(String words[])
    {
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";

        List<String> result = new ArrayList<>();

        // Check each word
        for (String word : words) {
            if (isOneRowWord(word, row1) || isOneRowWord(word, row2) || isOneRowWord(word, row3)) {
                result.add(word);
            }
        }

        // Convert the result list to an array
        return result.toArray(new String[0]);
    }

    private static boolean isOneRowWord(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}