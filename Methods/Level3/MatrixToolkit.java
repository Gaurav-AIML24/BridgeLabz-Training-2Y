import java.util.Random;

public class MatrixToolkit {
    
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); 
            }
        }

        return matrix;
    }

    public static void displayMatrix(String title, double[][] matrix) {
        System.out.println("\n" + title);
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        inv[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        inv[0][2] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        inv[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        inv[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        inv[2][0] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        inv[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        double[][] adjoint = transpose(inv);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                adjoint[i][j] = adjoint[i][j] / det;
            }
        }

        return adjoint;
    }

    public static void main(String[] args) {
        double[][] matrix2x2 = generateMatrix(2, 2);
        displayMatrix("2x2 Matrix:", matrix2x2);
        displayMatrix("Transpose:", transpose(matrix2x2));
        System.out.printf("\nDeterminant: %.2f\n", determinant2x2(matrix2x2));
        double[][] inverse2 = inverse2x2(matrix2x2);
        if (inverse2 != null) {
            displayMatrix("Inverse:", inverse2);
        } else {
            System.out.println("Inverse not possible (Determinant is 0)");
        }

        double[][] matrix3x3 = generateMatrix(3, 3);
        displayMatrix("\n3x3 Matrix:", matrix3x3);
        displayMatrix("Transpose:", transpose(matrix3x3));
        System.out.printf("\nDeterminant: %.2f\n", determinant3x3(matrix3x3));
        double[][] inverse3 = inverse3x3(matrix3x3);
        if (inverse3 != null) {
            displayMatrix("Inverse:", inverse3);
        } else {
            System.out.println("Inverse not possible (Determinant is 0)");
        }
    }
}