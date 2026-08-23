import java.util.Scanner;
public class MatrixOperations {

    static int[] rowSums(int[][] matrix) {
        int[] sums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sums[i] = sums[i] + matrix[i][j];
            }
        }

        return sums;
    }

    static int[] columnSums(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] sums = new int[columns];

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                sums[j] = sums[j] + matrix[i][j];
            }
        }

        return sums;
    }

    static int[][] add(int[][] first, int[][] second) {

        if (first.length != second.length ||
            first[0].length != second[0].length) {

            return null;
        }

        int rows = first.length;
        int columns = first[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }

        return result;
    }

    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    static int[][] multiply(int[][] first, int[][] second) {

        if (first[0].length != second.length) {
            return null;
        }
        int rows = first.length;
        int columns = second[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                for (int k = 0; k < first[0].length; k++) {
                    result[i][j] =
                            result[i][j] + first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }

    static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter matrix values:");

        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println();
        System.out.println("Row sums:");
        printArray(rowSums(matrix));
        System.out.println("Column sums:");
        printArray(columnSums(matrix));
        System.out.println("Transpose:");
        printMatrix(transpose(matrix));
        sc.close();
    }
}
