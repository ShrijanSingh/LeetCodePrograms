package LeetCode;
import java.util.Scanner;
import java.util.*;
public class CintinuousArray {
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
        int res=findCont(ar);
        System.out.println("reslt="+res);
    }
    public static int findCont(int ar[])
    {
        int i=0,j=i+1,n=ar.length,c=0;
        while(true)
        {
            if ( i<n-1 && j<n)
            {
            if ((ar[i]==0 &&ar[j]==1)|| (ar[i]==1 && ar[j]==0)){
            c+=1;
            i=j+1;
            j=i+1;
            }
            else
            break;
        }
        else 
        break;
    }
    return c;
}
}