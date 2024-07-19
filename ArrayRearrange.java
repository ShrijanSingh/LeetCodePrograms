package LeetCode;

import java.util.Scanner;

public class ArrayRearrange {
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
        rearrangeArray(ar);
  } 
  public static void rearrangeArray(int[] nums) 
  {
    int l=nums.length;int p=0,q=1;
    int newar[]=new int[l];
    
  for(int k=0;k<l;k++)
  System.out.print(newar[k]+" ");
}
}

