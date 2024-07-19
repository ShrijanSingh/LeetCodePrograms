package LeetCode;
import java.util.*;
public class CardArrange {
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
        System.out.println("Enter the group value");
        int w=sc.nextInt();
        ArrangeCard(ar, w);
    }
    public static void ArrangeCard(int ar[], int w)
{
    int l=ar.length;
    if (l%w!=0)
    {
    System.out.println("False");
    return;
    }
    else
    {
        Arrays.sort(ar);
        for(int j=0;j<l;j++)
        System.out.print(ar[j]+" ");
        for(int i=0;i<l-1;i++)
        {
                int comp=ar[i+1];
                if ((Math.abs(ar[i]-comp))>1)
                {
                System.out.println("false");
                return;
                }
            }
        }
        System.out.println("true");
    }
}
