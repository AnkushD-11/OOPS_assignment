package Assignment_2;
public class q6 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Invalid.");
            return;
        }
        int rows = matrix1.length;
        int columns = matrix2[0].length;
        int dim = matrix1[0].length;

        int[][] prod = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < dim; k++) {
                    prod[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Product of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
    }
}
