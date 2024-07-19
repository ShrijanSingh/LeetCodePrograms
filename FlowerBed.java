package LeetCode;
import java.util.Scanner;
public class FlowerBed {
  public static void main(String[] args) {
    int[] flowerbed = {0,0,0,0,0};
    int n=3;
    System.out.println(canPlaceFlowers(flowerbed,n));

  }
  public static boolean canPlaceFlowers(int ar[], int n)
  {
    int c=0,j=0;
    if (ar.length==1)
    {
      if (ar[0]==0)
    return true;
    else 
    return false;
      }
        while (j<ar.length-1)
        {
          if (j==0 && ar[j]==0 && ar[j+1]==0)
          {
           ar[j]=1;
           j++;
           c++;
           continue;
          }
          else if (j>0 && ar[j]==0 && ar[j+1]==0 && ar[j-1]==0)
           {
            ar[j]=1;
            j++;
            c++;
            continue;
           }
          

           else if (ar[j]==1)
           {
            j+=2;
            continue;
           }
           else if (ar[j]==0 && ar[j+1]==1)
           {
            j++;
            continue;
           }
           j++;
          }
    if (c>=n)
    return true;
    else 
    return false;

  }
}
