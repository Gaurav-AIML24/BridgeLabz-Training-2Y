import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); 
            }
        }

        return matrix;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void displayMatrix(String title, int[][] matrix) {
        System.out.println("\n" + title);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();

            System.out.print("Enter number of columns: ");
            int cols = scanner.nextInt();

            int[][] matrixA = generateMatrix(rows, cols);
            int[][] matrixB = generateMatrix(rows, cols);

            displayMatrix("Matrix A:", matrixA);
            displayMatrix("Matrix B:", matrixB);

            int[][] sum = addMatrices(matrixA, matrixB);
            int[][] diff = subtractMatrices(matrixA, matrixB);
            int[][] product = multiplyMatrices(matrixA, matrixB); 

            displayMatrix("Addition (A + B):", sum);
            displayMatrix("Subtraction (A - B):", diff);
            displayMatrix("Multiplication (A x B):", product);
        }
    }
}
