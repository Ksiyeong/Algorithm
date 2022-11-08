import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11},
                {13, 14, 15}
        };
        int K = 1;
        System.out.println(matrix[0][0]); // --> 1
        System.out.println(matrix[2][2]); // --> 11

        int[][] rotatedMatrix = rotateMatrix(matrix, K);

        System.out.printf("내가만든 배열 : %s\n", rotatedMatrix);
        Arrays.stream(rotatedMatrix)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));

        System.out.println(rotatedMatrix[0][0]); // --> 13
        System.out.println(rotatedMatrix[2][2]); // --> 7
    }

    public static int[][] rotateMatrix(int[][] matrix, int K) {
        // TODO:
        if (matrix == null) return null;
        if (K == 0 || K % 4 == 0) return matrix;

        int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[0].length; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length - j - 1][i];

            }
        }

        return rotateMatrix(rotatedMatrix, K - 1);
    }

}
