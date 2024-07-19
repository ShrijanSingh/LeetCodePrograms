package LeetCode;
import java.util.*;
public class RelativeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length value1");
        int nums1=sc.nextInt();
        int ar1[]=new int[nums1];
        System.out.println("Enter the elements of the array1");
        for (int i=0;i<nums1;i++)
        {
         ar1[i]=sc.nextInt();   
        }
        System.out.println("enter the length value2");
        int nums2=sc.nextInt();
        int ar2[]=new int[nums2];
        System.out.println("Enter the elements of the array2");
        for (int i=0;i<nums2;i++)
        {
         ar2[i]=sc.nextInt();   
        }
        RelaeSort(ar1,ar2);

    }
    public static void RelaeSort(int [] ar1,int [] ar2)
    {
        int k=0, n=ar1.length,m=ar2.length;
        int newar[]=new int[m+n];
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
            if (ar1[j]==ar2[i])
            {
                newar[k]=ar2[i];
                k++;
                ar1[j]=-1;
            }
        }
    }
    Arrays.sort(ar1);
        for(int i=0;i<n;i++)
        {
            if (ar1[i]!=-1)
            {
                newar[k++]=ar1[i];
            }
        }
        System.out.println("answer array");
        for (int j=0;j<k;j++)
        {
            System.out.print(newar[j]+" ");
        }
}
}
