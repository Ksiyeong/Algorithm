import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main1097 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] board = new int[19][19];

        // 바둑판 복사
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        for (int count = 0; count < n; count++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            for (int i = 0; i < 19; i++) {
                if (board[x][i] == 1) {
                    board[x][i] = 0;
                } else {
                    board[x][i] = 1;
                }
            }
            for (int i = 0; i < 19; i++) {
                if (board[i][y] == 1) {
                    board[i][y] = 0;
                } else {
                    board[i][y] = 1;
                }
            }
            // 문제오류같음
//            if (board[x][y] == 1) {
//                board[x][y] = 0;
//            } else {
//                board[x][y] = 1;
//            }
        }

        for (int[] i : board) {
            for (int j : i) {
                bw.write(j + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
