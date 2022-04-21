package MatrixTranspose;

import java.util.Arrays;

public class MatrixTranspose {
    
    static int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        int[][] a = {
                    {1,2,3},
                    {4,5,6}
                    };
        System.out.println(Arrays.deepToString(transpose(a)));
    }
}
