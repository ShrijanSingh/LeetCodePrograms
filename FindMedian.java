package LeetCode;
import java.util.*;
public class FindMedian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double med=0.0;
        int l=(nums1.length)+(nums2.length);
        int ar[]=new int [l];
        for (int j=0;j<nums1.length;j++)
        ar[j]=nums1[j];
        int k=nums1.length;
        for (int i=0;i<nums2.length;i++)
        {
            ar[k++]=nums2[i];
        }
        Arrays.sort(ar);
        if ((ar.length)%2==0)
        {
            System.out.println("hi in if part");
            med=((double)(ar[(l/2)-1]+ar[l/2])/2);
        }
        else{
            System.out.println("hi in else part");
        med=(int)ar[(ar.length/2)];
        }
    return med;
    }
public static void main(String[] args) {
    {
        System.out.println("Enter the value of the num1 length and num2 length");
        Scanner sc=new Scanner(System.in);
        int nums1,nums2;
        nums1=sc.nextInt();
        nums2=sc.nextInt();
        int ar[]=new int[nums1];
        int ar2[]=new int[nums2];
        System.out.println("Enter the elements of the array1");
        for (int i=0;i<nums1;i++)
        {
         ar[i]=sc.nextInt();   
        }
        System.out.println("Enter the elements of the array2");
        for (int j=0;j<nums2;j++)
        ar2[j]=sc.nextInt();
        System.out.println("median="+findMedianSortedArrays(ar,ar2 ));
    }
} 
}
