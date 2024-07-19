package LeetCode;

import java.util.*;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] matrix = { { 0,1}, { 1,1 } };
        int[][] target = { { 1,0 }, { 0, 1} };
        rotationMatrix(matrix);
        int c = 1;
        boolean flag = true;
        System.out.println("ROTATED MATRIX");
        while (c<4){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target[i][j]) {
                    flag=true;
                }
                else
                flag=false;

            }
    
        }
        c++;
        
    }
    System.out.println("RESULT"+flag);
}
    public static void rotationMatrix(int[][] matrix) {
        int n = matrix.length;
        Transpose(matrix);
        for (int i = 0; i < matrix.length; i++)
            Reverse(matrix[i]);

    }

    public static void Transpose(int[][] matrix) {
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void Reverse(int[] matrix) {
        int i = 0, j = matrix.length - 1;
        while (i < j) {
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
    }
}
