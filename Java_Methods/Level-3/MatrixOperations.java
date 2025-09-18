import java.util.Scanner;

public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // Random 0–9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible!");
            return null;
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display matrix
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) return;
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter rows and columns for matrices: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Generate random matrices A & B
        int[][] A = createMatrix(rows, cols);
        int[][] B = createMatrix(rows, cols);

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Matrix B:");
        printMatrix(B);

        // Addition
        System.out.println("A + B:");
        printMatrix(addMatrix(A, B));

        // Subtraction
        System.out.println("A - B:");
        printMatrix(subtractMatrix(A, B));

        // Multiplication (only possible if colsA == rowsB)
        System.out.println("A * B:");
        printMatrix(multiplyMatrix(A, B));

        sc.close();
    }
}