package LeetCode;
import java.util.*;
public class Median {
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
        double med=median(ar);
        System.out.println("median="+med);
    }
        public static double median(int ar[])
        {
            int n=ar.length;
            if (n%2!=0)
            {
                return ((double)ar[(n)/2]);
            }
            else 
            return((double)(ar[(n-1)/2]+ar[(n-1)/2+1])/2);
        }
}
