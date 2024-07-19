package LeetCode;
import java.util.*;
public class IslandPeri {
   static  int count=0;
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        System.out.println("Enter the elements of array");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        isIsland(ar);
        System.out.println("count="+count);
        }
        public static  void isIsland(int [][] grid)
        {
            count=0;
            for (int i=0;i<grid.length;i++)
            {
                for (int j=0;j<grid[0].length;j++)
                {
                    if (grid[i][j]==1)
                    {
                        dfs(grid,i,j);
                        break;
                    }
                }
            }
        }
        public static void dfs(int grid[][],int i, int j)
        {
            if (i<0 || i>=grid.length || j<0  || j>=grid[0].length|| grid[i][j]==0)
            {
                count ++;
                return;
            }
            if (grid[i][j]==-1)
            return;
            grid[i][j]=-1;
            dfs(grid,i+1,j);
            dfs(grid,i-1,j);
            dfs(grid,i,j+1);
            dfs(grid,i,j-1);

        }
    }