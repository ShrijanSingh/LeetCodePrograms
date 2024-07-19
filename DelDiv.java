package LeetCode;
import java.util.*;
public class DelDiv {  
    static int d;
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("enter the length1 value");
        int nums1=sc.nextInt();
        int ar[]=new int[nums1];
        System.out.println("Enter the elements of the array1");
        for (int i=0;i<nums1;i++)
        {
         ar[i]=sc.nextInt();   
        }
        System.out.println("enter the length2 value");
        int nums2=sc.nextInt();
        int numsDiv[]=new int[nums2];
        System.out.println("Enter the elements of the array2");
        for (int i=0;i<nums2;i++)
        {
         numsDiv[i]=sc.nextInt();   
        }
        int res=minOperations(ar, numsDiv);
        System.out.println("Result="+res);
    }
    public static int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
      for (int i=0;i<nums.length;i++)
      {
        if (divide(numsDivide,nums[i]))
        {
            return i;
        }
        else
        {
            int n=delete(nums,nums[i]);
           return n;
        }
      }
      return -1;
    }
   public static boolean divide(int ar[],int n)
    {
        int c=0;
        for (int i=0;i<ar.length;i++)
        {
            if (ar[i]%n==0)
            c++;
        }
        if (c==ar.length)
        return true;
        else return false;
    }
    public static int delete(int ar[],int n)
    {
for (int i=0;i<n;i++)
{
    if (ar[i]==n)
    {
        d++;
    }
}
return d;
    }
}