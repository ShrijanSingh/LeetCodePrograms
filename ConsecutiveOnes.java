package LeetCode;
import java.util.*;
public class ConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the length value");
    int nums1=sc.nextInt();
    int ar[]=new int[nums1];
    System.out.println("Enter the elements of the array1");
    for(int k=0;k<nums1;k++)
    {
     ar[k]=sc.nextInt();   
    }
    int currentCount=0, maxCount=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        System.out.println("Max No. of 1's"+maxCount);
    }
}
