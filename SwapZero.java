package LeetCode;
import java.util.*;
public class SwapZero {
    static int k=0;
    public static void main(String[] args) {
        int ar[]={0,1,0,3,1};
        swapZero(ar);
        for (int i=0;i<ar.length;i++)
        System.out.print(ar[i]+ " ");
        
    }
    public static void swapZero(int ar[])
    {
        for (int i=0;i<ar.length;i++)
        {
            if (ar[i]!=0)
            {
                ar[k++]=ar[i];
            }
        }
        for (int j=k;j<ar.length;j++)
        {
            ar[j]=0;
        }
    }
}