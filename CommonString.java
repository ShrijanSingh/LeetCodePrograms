package LeetCode;

import java.util.*;

public class CommonString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length value1");
        int nums1 = sc.nextInt();
        sc.nextLine();
        String ar[] = new String[nums1];
        System.out.println("Enter the elements of the array1");
        for (int i = 0; i < nums1; i++) {
            ar[i] = sc.nextLine();
        }
        System.out.println("enter the length value2");
        int nums2 = sc.nextInt();
        sc.nextLine();
        String list2[] = new String[nums2];
        System.out.println("Enter the elements of the array2");
        for (int i = 0; i < nums1; i++) {
            list2[i] = sc.nextLine();
        }
        findRestaurant(ar, list2);
    }

    public static void findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        ArrayList<String> list=new ArrayList<String>();
        for (int i = 0; i < list1.length; i++) {
            for (int j=0;j<list2.length;j++){
            if (list1[i].equalsIgnoreCase(list2[j])) {
                if (min>=i+j)
                {
                    min=i+j;
                    list.add(list1[i]);
                }
                
            }
        }
    }
    System.out.println(list);
}}
