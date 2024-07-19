package LeetCode;
import java.util.Scanner;
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the length value");
        int nums1=sc.nextInt();
        int ar[]=new int[nums1];
        System.out.println("Enter the elements of the array1");
        for (int i=0;i<nums1;i++)
        {
         ar[i]=sc.nextInt();   
        }
        int k=removeDuplicates(ar);
        System.out.println("k="+k);
    }
        public static int removeDuplicates(int[] nums) {
            int m=nums.length;
            int c=0;
            int []newr=new int[10];
            for (int i=0;i<m;i++)
            {
                for (int j=i+1;j<m;j++)
                {
                    if (nums[i]!=nums[j] )
                    {
                        c++;
                        newr[i]=nums[i];
                    }
                   
                }
            }
            return c;
        }
    }
