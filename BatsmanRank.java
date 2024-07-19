package LeetCode;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class BatsmanRank
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length value");
        int nums1=sc.nextInt();
        int ar[]=new int[nums1];
        System.out.println("Enter the scores of Batsman");
        for (int i=0;i<nums1;i++)
        {
         ar[i]=sc.nextInt();   
        }
        findRank(ar);
    }
    public static void findRank(int ar[])
    {
        String ans[]=new String[ar.length];
        int response=0;
        for(int i=0;i<ar.length;i++)
        {
            response=rank(ar, ar[i]);
            if (response==1)
            ans[i]="Gold Medal";
            else if(response==2)
            ans[i]="Silver Medal";
            else if (response==3)
            ans[i]="Bronze Medal";
            else
            {
            ans[i]=Integer.toString(response);
        }
    }
    for (int i=0;i<ar.length;i++)
    System.out.print(ans[i]+" ");
}
    public static int rank(int ar[],int n)
    {
        int newar[]=Arrays.copyOf(ar,ar.length);
        Arrays.sort(newar);
        int res=0;
        for (int i=newar.length-1;i>=0;i--)
        {
            if (newar[i]==n)
            {
                res= (newar.length-i);
                break;
            }

        }
        System.out.println("resul+ "+ res);
        return res;
    }
    }