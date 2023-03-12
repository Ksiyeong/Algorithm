class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    danger(board, i - 1, j - 1);
                    danger(board, i - 1, j);
                    danger(board, i - 1, j + 1);
                    danger(board, i, j - 1);
                    danger(board, i, j + 1);
                    danger(board, i + 1, j - 1);
                    danger(board, i + 1, j);
                    danger(board, i + 1, j + 1);
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