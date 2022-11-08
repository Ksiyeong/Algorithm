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
        // 시계 방향으로 90도 회전시킨다
        // 여러번 회전해야할 경우를 위해 K가 0이 될때까지 재귀로 회전
        if (matrix == null || K == 0 || K % 4 == 0) return matrix;

        int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[0].length; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length - j - 1][i];
            }
        }
        return rotateMatrix(rotatedMatrix, K - 1);
    }

    public int[][] reference(int[][] matrix, int K) {
        //빈 배열일 경우
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
