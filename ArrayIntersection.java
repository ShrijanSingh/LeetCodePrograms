package LeetCode;
import java.util.*;
public class ArrayIntersection {
    static int newar[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array1 length value");
        int nums1=sc.nextInt();
        int ar1[]=new int[nums1];
        System.out.println("Enter the elements of the array1");
        for (int i=0;i<nums1;i++)
        {
         ar1[i]=sc.nextInt();   
        }
        System.out.println("Enter the array2 length value");
        int nums2=sc.nextInt();
        int ar2[]=new int[nums2];
        System.out.println("Enter array2 values;");
        for (int j=0;j<nums2;j++)
           ar2[j]=sc.nextInt();
           intersection(ar1,ar2);
    }
//     // public static void findCommon(int ar1[], int ar2[])
//     {
//         int k=0;
//        int min=Math.min(ar1.length,ar2.length);
//     for (int i=0;i<ar1.length;i++)
//     {
//         for (int j=0;j<ar2.length;j++)
//         {
//             if (ar1[i]==ar2[j] && isPresent(ar1[i])!=1 && isPresent(ar2[j])!=1 ){
//             newar[k++]=ar1[i];
//         }
//     }
//     }
//     System.out.println("New  intersected array:");
//     for (int i=0;i<k;i++)
//     {
//             System.out.print(newar[i]+ " ");
//     }
// }
// public static int isPresent(int n)
// {
//     for(int i=0;i<newar.length;i++)
//     {
//         if (n==newar[i])
//         return 1;
//     }
//     return 0;
// }
// }
// Using ArrayList
public static void intersection(int[] ar1, int[] ar2)
{
    ArrayList<Integer> result=new ArrayList<>();
int i=0,j=0;
while(i<ar1.length && j< ar2.length )
{
    if (ar1[i]==ar2[j])
    {
    result.add(ar1[i]);
    i++;
    j++;
}
else if (ar1[i] < ar2[j]) {
    i++;
} else {
    j++;
}
}
int resultArr[]=new int[result.size()];
for (int k=0;k<result.size();k++)
{
resultArr[k]=result.get(k);
}
System.out.println("Result Array");
for (int s=0;s<resultArr.length;s++)
{
    System.out.print(resultArr[s]);
}
}
}