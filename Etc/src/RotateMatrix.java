import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int K = 0;
        System.out.println(matrix);
        System.out.println(matrix[0][0]); // --> 1
        System.out.println(matrix[3][2]); // --> 15

        int[][] rotatedMatrix = rotateMatrix(matrix, K);
        int[][] rotatedMatrix2 = rotateMatrix2(matrix, K);

        System.out.printf("내가만든 배열 : %s\n",rotatedMatrix);
        Arrays.stream(rotatedMatrix)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));

        System.out.printf("레퍼런스 코드배열 : %s\n",rotatedMatrix2);
        Arrays.stream(rotatedMatrix2)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));

        System.out.println(rotatedMatrix[0][0]); // --> 13
        System.out.println(rotatedMatrix[3][2]); // --> 8

        System.out.println(rotateMatrix(matrix, K)[0][0]);
        System.out.println(rotateMatrix(matrix, K)[3][2]);
    }

    public static int[][] rotateMatrix(int[][] matrix, int K) {
        // TODO:
        if (matrix == null) return null;
        if (K == 0 || K % 4 == 0) return matrix;

        int[][] rotatedMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length - j - 1][i];

            }
        }

        return rotateMatrix(rotatedMatrix, K - 1);
    }

    static public int[][] rotateMatrix2(int[][] matrix, int K) {
        if (matrix == null || matrix.length == 0) return matrix;

        int N = matrix.length;
        int M = matrix[0].length;

        int rotateNum = K % 4;
        // 회전하지 않는다.
        if (rotateNum == 0) return matrix;
        // 홀수번 회전 시 M x N, 짝수번 회전 시 N x M
        int[][] rotated = rotateNum % 2 == 1 ? new int[M][N] : new int[N][M];

        for (int row = 0; row < rotated.length; row++) {
            for (int col = 0; col < rotated[row].length; col++) {
                if (rotateNum == 1) {
                    rotated[row][col] = matrix[N - col - 1][row];
                } else if (rotateNum == 2) {
                    rotated[row][col] = matrix[N - row - 1][M - col - 1];
                } else {
                    rotated[row][col] = matrix[col][M - row - 1];
                }
            }
        }
        return rotated;
    }
}
