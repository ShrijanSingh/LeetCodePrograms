package LeetCode;
import java.util.*;
public class StringComp {
    public static void main(String[] args) {
        // System.out.println("Enter the size of the array");
        Scanner sc=new Scanner (System.in);
        // int n=sc.nextInt();
        // System.out.println("Enter the array elements of the array");
        int width[]={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        System.out.println("Enter the String");
        String s=sc.next();
        int ar[]=findString(width,s);
        System.out.println("ANS");
        System.out.println(ar[0]+" " +ar[1]);
    }
    public static int [] findString(int width[], String s)
    {
      int   l=s.length(),i=0,sum=0,nol=1;
        while(i<l)
    {
        for (char c='a';c<='z';c++)
        {
            if (s.charAt(i)== c)
            {
                if (sumReturn(sum, width[c-97])<=100)
                {
                    sum+=width[c-97];
                }
                else
                {
                    sum=0;
                    nol++;
                    sum+=width[c-97];
                    
                }
            }
        }
        i++;
    }
    int ar[]={nol, sum};
return ar;
    }
    public static int sumReturn(int a, int b)
    {
        return a+b;
    }
}
