import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main1098 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        int[][] board = new int[h][w];

        // l 길이, d 방향 0=가로 1=세로, 좌표 (x,y)

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            if (d == 1) { // 세로 방향일경우
                for (int j = 0; j < l; j++) {
                    board[x + j][y] = 1;
                }
            } else { // 가로 방향일경우
                for (int j = 0; j < l; j++) {
                    board[x][y + j] = 1;
                }
            }
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
