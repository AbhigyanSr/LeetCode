package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        int nr=matrix.length;
        int nc=matrix[0].length;
        List<int[]> zeros = new ArrayList<>();
        for (int i = 0; i < nr ; i++) {
            for (int j = 0; j < nc; j++) {
                if(matrix[i][j]==0){
                    zeros.add(new int[]{i,j});
                }
            }
        }
        for (int[] zero : zeros) {
            int r = zero[0];
            int c = zero[1];

            for (int k = 0; k < nc; k++) {
                matrix[r][k] = 0;
            }
            for (int k = 0; k < nr; k++) {
                matrix[k][c] = 0;
            }
        }
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.println(matrix[i][j]);
            }
        }

    }
}
