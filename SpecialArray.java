package LeetCode;
import java.util.Scanner;
public class SpecialArray {
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
    int res=Result(ar);
System.out.println("result="+res);
    }
// public static int countMax(int ar[])
// {

//     int max=ar[0];
//     for (int i=0;i<ar.length;i++)
//     {
//         if (ar[i]>max)
//         {
//             max=ar[i];
//         }
//     }
//     return max;
// }
public static int Result(int ar[])
{
    int count=0;
    for(int i=0;i<=1001;i++)
    {
        for (int j=0;j<ar.length;j++)
        {
            if (ar[j]>=i)
            {
            count++;
        }
    }
        if (count==i)
        return count;
        count=0;
    }
    return -1;
    }
}