package LeetCode;
import java.util.*;
public class SeparateD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length value");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements of the array1");
        for (int i=0;i<n;i++)
        {
         ar[i]=sc.nextInt();   
        }
        Divide(ar);
    }
public static void Divide(int ar[])
{
    int n=ar.length;int newar[]=new int[100];int k=0;
    for (int i=0;i<n;i++)
    {
        while(ar[i]>0)
        {
            newar[k++]=ar[i]%10;
            ar[i]=ar[i]/10;;
        }
    }
    for (int i=0;i<k;i++)
    System.out.println(newar[i]);
}
}
