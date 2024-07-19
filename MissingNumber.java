package LeetCode;
import java.util.Arrays;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
            int ar[]={0};
            int res=findMissing(ar);
            System.out.println("Result="+res);
        }
    public static int findMissing(int ar[])
    {
        Arrays.sort(ar);
        int res=0;
        if (ar.length==1){
        if (ar[0]!=0)
        {
         return 0;
        }
        if (ar[0]==0)
        return 1;
    }
        for (int i=0;i<ar.length-1;i++)
        {
       if (ar[i+1]-ar[i]!=1)
       {
        res= ++ar[i];
        return res;
       }
    }
    for (int i=0;i<ar.length-1;i++)
    {
       if (ar[i+1]-ar[i]==1 && ar[0]==0)
       {
        res= ++ar[ar.length-1];
        break;
       }
    }
    return res;
}
}
