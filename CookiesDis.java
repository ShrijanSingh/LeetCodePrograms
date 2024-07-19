package LeetCode;

import java.util.*;

public class CookiesDis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length value");
        int nums1 = sc.nextInt();
        int g[] = new int[nums1];
        System.out.println("Enter the greed factor array");
        for (int i = 0; i < nums1; i++) {
            g[i] = sc.nextInt();
        }
        System.out.println("Enter the length 2");
        int nums2 = sc.nextInt();
        int s[] = new int[nums2];
        System.out.println("Enter the array2 elements");
        for (int i = 0; i < nums2; i++) {
            s[i] = sc.nextInt();
        }
       int res= calSum(g, s);
       System.out.println("result="+res);
    }
        public static  int calSum(int[] g, int[] s) 
        {
          Arrays.sort(g);
            Arrays.sort(s);
            
            int contentChildren = 0;
            int cookieIndex = 0;
            
            for (int greed : g)
            {
                while (cookieIndex < s.length && s[cookieIndex] < greed) {
                    cookieIndex++;
                }
                if (cookieIndex < s.length) {
                    contentChildren++;
                    cookieIndex++;
                }
            }
            return contentChildren;
        }   
        
        }