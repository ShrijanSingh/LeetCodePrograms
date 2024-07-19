package LeetCode;
public class MostWater {
    public static void main(String[] args) {
        int height[]={2,2};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int max=0;                                              
        int l=0,r=height.length-1;
        while(l<r)
        {
            int lp=height[l];
            int rp=height[r];
            int min_h=Math.min(lp,rp);
            int len=r-l;
            int area=min_h*len;
            max=Math.max(max,area);
            if (lp<rp)
            l++;
            else
             r--;

        }
        
        return max;
}
}
