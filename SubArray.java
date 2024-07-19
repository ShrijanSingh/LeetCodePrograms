package LeetCode;
import java.util.*;
public class SubArray {
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
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        boolean res=check_SubArray(ar, k);
        System.out.println("anSWER="+res);
    }
    public static boolean check_SubArray(int nums[], int k)
    {
        int n=nums.length,sum=0;
        boolean ans=false;
        for (int i=0;i<n/2;i++)
        {
            sum=nums[i];
            for (int j=i+1;j<n;j++)
            {
             sum+=nums[j]; 
                if( sum%k==0)
                {
                ans=true;
                System.out.println("i value "+i+" "+"j value "+j);
            }
        }
        sum=0;
    }if(ans!=true)
    {
    for (int i=n/2;i<n;i++)
        {
            sum=nums[i];
            for (int j=i+1;j<n;j++)
            {
             sum+=nums[j]; 
                if( sum%k==0)
                {
                ans=true;
               
            }
        }
        sum=0;
    }
}
        return ans;
    }
}
