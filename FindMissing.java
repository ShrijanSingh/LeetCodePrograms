package LeetCode;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class FindMissing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int s = sc.nextInt();
        int ar[] = new int[s];
        System.out.println("Enter the array elements");
        for (int i = 0; i < s; i++) {
            ar[i] = sc.nextInt();
        }
        
        findEle(ar);
        
    }

public static void findEle(int ar[])
{
    ArrayList<Integer> list=new ArrayList<>();
    Arrays.sort(ar);
for (int i=0;i<ar.length;i++)
{
    list.add(ar[i]);
}
for(int i=0;i<ar.length-1;i++)
{
    if (Math.abs(list.get(i)-list.get(i+1))!=1 && list.get(i)!=list.get(i+1))
    {
        list.set(i+1, (list.get(i)+1));
        
    }
}
System.out.println(list);
}
}
