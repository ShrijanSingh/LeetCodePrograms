package LeetCode;
import java.util.Scanner;
import java.util.ArrayList;
public class Attack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the length value");
    int nums1=sc.nextInt();
    int ar[]=new int[nums1];
    System.out.println("Enter the elements of the attacking array1");
    for(int k=0;k<nums1;k++)
    {
     ar[k]=sc.nextInt();   
    }
    System.out.println("Enter the duration");
    int d=sc.nextInt();
findPoisonedDuration(ar, d);
    }
    public static void findPoisonedDuration(int[]ar, int d)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int res = 0, reset = 0;
        
        for (int i = 0; i < ar.length; i++) {
            list.add(ar[i]);
            if ((i + 1) != ar.length && sum(ar[i], d) < ar[i + 1]) {
                list.add(ar[i] + d - 1);
            } else {
                if (i + 1 != ar.length && sum(ar[i], d) >= ar[i + 1]) {
                    reset++;
                }
                list.add(ar[i] + d - 1);
            }
        }
        
        System.out.println("*******************");
        System.out.println(list);
        System.out.println("*******************");
        
        int newar[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            newar[i] = list.get(i);
        
        for (int i = 0; i < newar.length - 1; i++) {
            res += newar[i + 1] - newar[i];
        }
        
        System.out.println("RESULT " + (res + reset));
    }

    public static int sum(int a, int b) {
        return (a + b - 1);
    }
}
