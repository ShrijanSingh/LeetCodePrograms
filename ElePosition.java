package LeetCode;
import java.util.*;
public class ElePosition {
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
        
        System.out.println("Enter the target");
        int t=sc.nextInt();
        int res=searchInsert(ar,t);
        System.out.println("Result="+res);
    }
        public static int searchInsert(int[] nums, int target) {
            int i=0,n=nums.length,j=n-1;
            while(i<=j)
            {
                if(nums[i]==target)
                return i;
                else if(nums[j]==target)
                return j;
                i++;
                j--;
        }
        for (int k=0;k<n-1;k++)
        {
            if (nums[k]<target && nums[k+1]>target)
            return (k+1);
        }
        if (target>nums[n-1])
        return n;
        else return 0;
        }
    }