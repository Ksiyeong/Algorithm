public class 인접행렬길찾기 {
    public static void main(String[] a) {
        int[][] matrix = new int[][]
                {
                        {0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 1, 0, 0},
                        {1, 1, 1, 1, 0}
                };
        System.out.println(getDirections(matrix, 1, 4));
        System.out.println(getDirections(matrix, 0, 4));
        System.out.println(getDirections(matrix, 2, 3));
    }

    static public boolean getDirections(int[][] matrix, int from, int to) {
        // TODO: 인접 행렬 길찾기
        // 재귀를 써보자
        // 순차적으로 from에서 갈수있는 길들을 확인 거기서 길이 있으면 ok
        // 길이 없으면 from을 해당 번호로 바꾸어 재귀발동

        // matrix를 복사 -> 입력된 matrix를 변경하지 마시오
        int[][] newMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }

        if (newMatrix[from][to] == 1) return true;

        for (int i = 0; i < matrix.length; i++) {
            if (newMatrix[from][i] == 1) {
                newMatrix[from][i] = 0; // 무향일 경우 무한루프 방지 - 왔던길을 0으로 바꾼다
                if (getDirections(newMatrix, i, to)) return true;
            }
        }
        return false;
    }
}
