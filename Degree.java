package LeetCode;
import java.util.*;
public class Degree {
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
       int deg= degree (ar);
       deg++;
       System.out.println("deg="+deg);
    }
    public static int degree(int ar[])
    {
        int freq[]=new int [ar.length];
        int k=0;
        for (int i=0;i<ar.length;i++)
        {
            for (int j=i+1;j<ar.length;j++)
            {
                if (ar[i]==ar[j])
                {
                    freq[k]=freq[k]+1;
                }
            }
            k++;
        }
        for (int i=0;i<freq.length;i++)
        System.out.println("freq[i]"+freq[i]);
        Arrays.sort(freq);
        return freq[freq.length-1];
    }
}
