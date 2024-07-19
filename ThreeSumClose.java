package LeetCode;

import java.util.*;

public class ThreeSumClose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length value");
        int nums1 = sc.nextInt();
        int ar[] = new int[nums1];
        System.out.println("Enter the elements of the array1");
        for (int i = 0; i < nums1; i++) {
            ar[i] = sc.nextInt();
        }
        // System.out.println("Emter the target value");
        // int target = sc.nextInt();
        findClosest(ar, 0);
    }

    public static void findClosest(int nums[], int target) {

        int diff = Integer.MAX_VALUE, res = 0;

        // for (int i = 0; i < ar.length - 2; i++) {
        // for (int j = i + 1; j < ar.length - 1; j++) {
        // for (int k = j + 1; k < ar.length; k++) {
        // int sum = ar[i] + ar[j] + ar[k];
        // int sub = Math.abs(target - sum);
        // if (sub < diff) {
        // diff = sub;
        // res = sum;
        // }
        // }

//       Arrays.sort(nums);
//       int closestSum=nums[0]+nums[1]+nums[2];
//       for (int i=0;i<nums.length-2;i++)
//       {
//         int left=i+1;
//         int right=nums.length-1;
//         while (left<right)
//         {
            
//             int currentSum = nums[i] + nums[left] + nums[right];
                
       
//             if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
//                 closestSum = currentSum;
//             }
//                 if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
//                     closestSum = currentSum;
//                 }
//                 if (currentSum < target) {
//                     left++;
//                 } else {
//                     right--;
//                 }
//             }
//         }
//     System.out.println(closestSum);
// }
// }
ArrayList <Integer> list=new ArrayList<>();
Arrays.sort(nums);
for (int i=0;i<nums.length-2;i++)
{
  int left=i+1;
  int right=nums.length-1;
  while (left<right)
  {
      
      int currentSum = nums[i] + nums[left] + nums[right];
      if (currentSum==0)
      {
        list.add(nums[i]);
        list.add(nums[left]);
        list.add(nums[right]);
      }
          if (currentSum < target) {
              left++;
          } else {
              right--;
          }
      }
  }

  System.out.println(list);

}
}