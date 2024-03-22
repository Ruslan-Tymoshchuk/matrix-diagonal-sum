package pl.sum.diagonal.matrix;

public class MatrixCalculator {

    private static final String EXCEPTION_CAUSE_MESSAGE = "Matrix shouldn't be empty and should be square";

    public int countSumDiagonals(int[][] mat) {
        if (mat.length > 0 && mat[0].length > 0 && mat.length == mat[0].length) {
            int sum = 0;
            for (int i = 0, j = mat.length - 1; i < mat.length; i++, j--) {
                sum += mat[i][i];
                if (i != j) {
                    sum += mat[i][j];
                }
            }
            return sum;
        } else {
            throw new IllegalArgumentException(EXCEPTION_CAUSE_MESSAGE);
        }

    }
}