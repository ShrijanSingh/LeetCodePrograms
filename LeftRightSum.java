package LeetCode;

import java.util.*;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {

            ar[i] = sc.nextInt();

        }
        leftright(ar);

    }

public static void leftright(int nums[])
{
   int n = nums.length;
int[] leftSum = new int[n];
int[] rightSum = new int[n];
int[] answer = new int[n];

// Calculate leftSum array
for (int i = 1; i < n; i++) {
    leftSum[i] = leftSum[i - 1] + nums[i - 1];
}

// Calculate rightSum array
for (int i = n - 2; i >= 0; i--) {
    rightSum[i] = rightSum[i + 1] + nums[i + 1];
}

// Calculate answer array
for (int i = 0; i < n; i++) {
    answer[i] = Math.abs(leftSum[i] - rightSum[i]);
}
for(int i=0;i<answer.length;i++)
System.out.println(answer[i]);
}
}