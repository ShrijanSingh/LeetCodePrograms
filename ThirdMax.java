package LeetCode;
import java.util.*;
public class ThirdMax {
    public static void main(String[] args) {
        int ar[]={3,2,1};
        findMax(ar);
        // System.out.println("Result="+res);
        
    }
public static void findMax(int nums[])
{
    Set<Integer> distinctNumsSet = new HashSet<>();
    for (int num : nums) {
        distinctNumsSet.add(num);
    }
    List<Integer> distinctNumsList = new ArrayList<>(distinctNumsSet);
    Collections.sort(distinctNumsList, Collections.reverseOrder());

    if (distinctNumsList.size() >= 3) {
        return distinctNumsList.get(2);
    } else {
        return distinctNumsList.get(0);
    }
}
}