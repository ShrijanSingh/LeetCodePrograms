package LeetCode;
import java.util.*;
public class RemoveOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length value");
        int nums1=sc.nextInt();
        int ar[]=new int[nums1];
        System.out.println("Enter the elements of the array1");
        for (int i=0;i<nums1;i++)
        {
         ar[i]=sc.nextInt();   
        }
        System.out.println("Enter the element to be removed");
        int k=sc.nextInt();
        RemoveEle(ar,k);
    }
    public static void RemoveEle(int ar[], int k)
    {
        int i=0,j=ar.length-1,c=0;
        while(i<=j)
        {
            if(ar[i]==k)
            {
                c++;
                ar[i]=Integer.MAX_VALUE;
            }
            if (ar[j]==k)
            {
                c++;
                ar[j]=Integer.MAX_VALUE;
            }
            i++;
            j--;
        }
        
//         for (int t=0;t<ar.length;t++)
//         {
//     for (int p=0;p<ar.length-1;p++)
//     {
// if (ar[p]==Integer.MAX_VALUE)
// {
//     int temp=ar[p];
//     ar[p]=ar[p+1];
//     ar[p+1]=temp;
// }
    
System.out.println("answer="+(ar.length-c));
for (int o=0;o<ar.length;o++)
{
System.out.println(ar[o]);
}
    }
}
