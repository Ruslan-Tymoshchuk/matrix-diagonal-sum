package pl.sum.diagonal.matrix;

public class MatrixCalculator {

    public int countSum(int[][] mat) {
        int sum = 0;
        for (int i = 0, j = mat.length - 1; i < mat.length; i++, j--) {
            if (mat[0].length == 0) {
                return sum;
            }
            sum += mat[i][i];
            if (i != j) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
}