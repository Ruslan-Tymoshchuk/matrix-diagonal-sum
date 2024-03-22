package pl.sum.diagonal.matrix;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MatrixCalculatorTest {

    private final MatrixCalculator matrixCalculator = new MatrixCalculator();

    @Test
    void givenNull_whenСountSumDiagonals_thenException() {
        assertThrows(NullPointerException.class, ()-> matrixCalculator.countSumDiagonals(null));
    }
    
    @Test
    void givenNonSquareMatrix_whenСountSumDiagonals_thenException() {
        int[][] nonSquareMatrix = { { 1, 2, 3 }, 
                                    { 4, 5, 6 } };
        assertThrows(IllegalArgumentException.class, () -> matrixCalculator.countSumDiagonals(nonSquareMatrix));
    }

    @Test
    void givenEmptyMatrix_whenСountSumDiagonals_thenException() {
        int[][] emptyMatrix = { {} };
        assertThrows(IllegalArgumentException.class, () -> matrixCalculator.countSumDiagonals(emptyMatrix));
    }
    
    @Test
    void givenMatrixContainsFive_whenСountSumDiagonals_thenFive() {
        int[][] squareMatrix = { { 5 } };
        assertEquals(5, matrixCalculator.countSumDiagonals(squareMatrix));
    }
    
    @Test
    void givenMatrixContainsOneToNine_whenСountSumDiagonals_thenTwentyFive() {
        int[][] squareMatrix = { { 1, 2, 3 }, 
                                 { 4, 5, 6 }, 
                                 { 7, 8, 9 } };
        assertEquals(25, matrixCalculator.countSumDiagonals(squareMatrix));
    }
    
    @Test
    void givenMatrixContainsOnes_whenСountSumDiagonals_thenEight() {
        int[][] squareMatrix = { { 1, 1, 1, 1 }, 
                                 { 1, 1, 1, 1 }, 
                                 { 1, 1, 1, 1 }, 
                                 { 1, 1, 1, 1 } };
        assertEquals(8, matrixCalculator.countSumDiagonals(squareMatrix));
    }
}