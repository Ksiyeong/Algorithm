import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int move : moves) {
            int doll = grab(board, move);
            if (doll != 0) {
                if (stack.peek() == doll) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(doll);
                }
            }
        }
        return answer;
    }

    int grab(int[][] board, int move) {
        int doll = 0;
        move -= 1;
        for (int i = 0; i < board.length; i++) {
            if (board[i][move] != 0) {
                doll = board[i][move];
                board[i][move] = 0;
                return doll;
            }
        }
        return doll;
    }
}