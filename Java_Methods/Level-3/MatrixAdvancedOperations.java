import java.util.Scanner;

public class MatrixAdvancedOperations {

    // Method to create a random matrix
    public static double[][] createMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // random 0–9
            }
        }
        return matrix;
    }

    // Method to display matrix
    public static void printMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix is null.");
            return;
        }
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to find transpose of a matrix
    public static double[][] transpose(double[][] A) {
        int rows = A.length, cols = A[0].length;
        double[][] T = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
             - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
             + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] A) {
        double det = determinant2x2(A);
        if (det == 0) {
            System.out.println("Matrix is singular. No inverse exists.");
            return null;
        }
        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / det;
        inv[0][1] = -A[0][1] / det;
        inv[1][0] = -A[1][0] / det;
        inv[1][1] = A[0][0] / det;
        return inv;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] A) {
        double det = determinant3x3(A);
        if (det == 0) {
            System.out.println("Matrix is singular. No inverse exists.");
            return null;
        }

        double[][] adj = new double[3][3];
        // Cofactor expansion
        adj[0][0] = (A[1][1] * A[2][2] - A[1][2] * A[2][1]);
        adj[0][1] = -(A[1][0] * A[2][2] - A[1][2] * A[2][0]);
        adj[0][2] = (A[1][0] * A[2][1] - A[1][1] * A[2][0]);

        adj[1][0] = -(A[0][1] * A[2][2] - A[0][2] * A[2][1]);
        adj[1][1] = (A[0][0] * A[2][2] - A[0][2] * A[2][0]);
        adj[1][2] = -(A[0][0] * A[2][1] - A[0][1] * A[2][0]);

        adj[2][0] = (A[0][1] * A[1][2] - A[0][2] * A[1][1]);
        adj[2][1] = -(A[0][0] * A[1][2] - A[0][2] * A[1][0]);
        adj[2][2] = (A[0][0] * A[1][1] - A[0][1] * A[1][0]);

        // Transpose adj (adjugate matrix)
        double[][] adjT = transpose(adj);

        // Multiply by 1/det
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[i][j] = adjT[i][j] / det;
            }
        }
        return inv;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();

        if (n != 2 && n != 3) {
            System.out.println("Only 2x2 and 3x3 matrices supported.");
            return;
        }

        double[][] A = createMatrix(n, n);
        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Transpose of A:");
        printMatrix(transpose(A));

        if (n == 2) {
            double det = determinant2x2(A);
            System.out.println("Determinant = " + det);
            System.out.println("Inverse of A:");
            printMatrix(inverse2x2(A));
        } else {
            double det = determinant3x3(A);
            System.out.println("Determinant = " + det);
            System.out.println("Inverse of A:");
            printMatrix(inverse3x3(A));
        }

        sc.close();
    }
}