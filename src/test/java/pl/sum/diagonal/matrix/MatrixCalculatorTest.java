package pl.sum.diagonal.matrix;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MatrixCalculatorTest {

    private final MatrixCalculator matrixCalculator = new MatrixCalculator();

    @Test
    void givenNull_whenCountSum_thenException() {
        assertThrows(NullPointerException.class, ()-> matrixCalculator.countSum(null));
    }
    
    @Test
    void givenEmptyMatrix_whenCountSum_thenZero() {
        int[][] squareMatrix = { {} };
        assertEquals(0, matrixCalculator.countSum(squareMatrix));
    }
    
    @Test
    void givenMatrixContainsFive_whenCountSum_thenFive() {
        int[][] squareMatrix = { { 5 } };
        assertEquals(5, matrixCalculator.countSum(squareMatrix));
    }
    
    @Test
    void givenMatrixContainsOneToNine_whenCountSum_thenTwentyFive() {
        int[][] squareMatrix = { { 1, 2, 3 }, 
                                 { 4, 5, 6 }, 
                                 { 7, 8, 9 } };
        assertEquals(25, matrixCalculator.countSum(squareMatrix));
    }
    
    @Test
    void givenMatrixContainsOnes_whenCountSum_thenEight() {
        int[][] squareMatrix = { { 1, 1, 1, 1 }, 
                                 { 1, 1, 1, 1 }, 
                                 { 1, 1, 1, 1 }, 
                                 { 1, 1, 1, 1 } };
        assertEquals(8, matrixCalculator.countSum(squareMatrix));
    }
}