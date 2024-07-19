package LeetCode;
import java.util.Scanner;
public class RotateArray {
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
        int k=0;
        System.out.println("Enter the value of k");
        k=sc.nextInt();
        int n=1;
            while(n<=k+1){
        reverse(ar,0,nums1-n-1);
        reverse(ar,nums1-n,nums1-1);
        reverse(ar,0,nums1-1);
                k--;
        n++;
    }
System.out.println("reversed array");
for (int i=0;i<nums1;i++)
System.out.println(ar[i]);
}
public static void reverse(int ar[],int i,int j){
    {
    while (i < j) {
        ar[i] = ar[i] + ar[j];
        ar[j] = ar[i] - ar[j];
        ar[i] = ar[i] - ar[j];
        i++;
        j--;
    }
}}
}
