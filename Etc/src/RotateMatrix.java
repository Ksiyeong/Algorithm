public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int K = 1;

        System.out.println(matrix[0][0]); // --> 1
        System.out.println(matrix[3][2]); // --> 15

        int[][] rotatedMatrix = rotateMatrix(matrix, K);
        System.out.println(rotatedMatrix[0][0]); // --> 13
        System.out.println(rotatedMatrix[3][2]); // --> 8
    }

    public static int[][] rotateMatrix(int[][] matrix, int K) {
        // TODO:
        if (matrix.length == 0) return null;
        if (K == 0) return matrix;

        int[][] rotatedMatrix = new int[matrix.length][matrix.length];


        return rotatedMatrix;
    }
}
