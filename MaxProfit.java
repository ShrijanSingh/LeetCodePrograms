package LeetCode;
import java.util.Scanner;
public class MaxProfit {
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
        int res=maxProfit(ar);
        System.out.println("Profit="+res);
}
public static int maxProfit(int[] ar) {
int index=0,n=ar.length;
int diff=0;
for (int i=0;i<n;i++)
{
for (int j=i+1;j<n;j++)
{
       if (diff<(ar[j]-ar[i]))
       {
              diff=ar[j]-ar[i];
       }
}
}
return diff;
}
}
