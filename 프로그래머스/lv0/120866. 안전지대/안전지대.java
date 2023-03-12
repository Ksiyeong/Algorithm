class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            danger(board, i + k, j + l);
                        }
                    }
                }
            }
        }
        for (int[] ints : board) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }

    void danger(int[][] board, int i, int j) {
        try {
            if (board[i][j] != 1) {
                board[i][j] = 2;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
}