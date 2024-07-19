package LeetCode;
import java.util.Scanner;
public class Majority {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size");
    int n=sc.nextInt();
    int ar[]=new int[n];
    System.out.println("Enter the values of the array");
    for (int i=0;i<n;i++)
    {
        ar[i]=sc.nextInt();
    }
    printMajority(ar, n);
   
}
public static int findCandidate(int ar[],int size)
{
    int maj_index=0, c=1;
    for (int i=1;i<size;i++)
{
    if (ar[maj_index]==ar[i])
    {
        c++;
    }
    else
    c--;
    if (c==0)
    {
        maj_index=i;
        c=1;
    }
}
return ar[maj_index];
}
public static void printMajority(int ar[], int size)
{
    int cand=findCandidate(ar,size);
    if (isMajority(ar, size,cand))
    System.out.println("candidate P="+cand);
    else
    System.out.println("not present");
}
public static boolean isMajority(int ar[], int size, int cand)
{
    int c=0;
    for (int i=0;i<size;i++)
        if (ar[i]==cand)
        c++;
        if (c>size/2)
        {
    return true;
        }
        else 
        return false;
    }
}
