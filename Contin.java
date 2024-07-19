package LeetCode;
import java.util.*;
public class Contin {
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
       boolean deg= isMonotonic (ar);
       System.out.println(deg);
    }
    public static  boolean isMonotonic(int[] nums) {
            
            int c=0,k=0;
            for (int i=0;i<nums.length-1;i++)
            {
                if (nums[i]>=nums[i+1])
                {
                    c++;
                }
                if(nums[i]<=nums[i+1])
                {
                    k++;
                }
            }
            if (c==(nums.length-1) || k==(nums.length-1))
            return true;
            else
            return false;
    
        }
     }