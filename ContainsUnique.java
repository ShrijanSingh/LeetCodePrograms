package LeetCode;
import java.util.*;
public class ContainsUnique {
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
        boolean res=isUnique(ar);
        System.out.println("Result="+res);
    }
        public static boolean isUnique(int ar[])
        {
            boolean t=false;
            Arrays.sort(ar);
            for (int i=0;i<ar.length-1;i++)
            {
                if (ar[i]==ar[i+1])
                t=true;
            }
          return t;
            }
        }
