import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main1099 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] board = new int[10][10];

        // 미로 복사
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int x = 1;
        int y = 1;

        while (true) {
            if (board[y][x] == 2) { // 먹이를 만나면 break
                board[y][x] = 9;
                break;
            }

            board[y][x] = 9; // 현재 위치 표시

            if (board[y][x + 1] != 1) { // 오른쪽이 벽인지 판단
                x += 1;
            } else if (board[y + 1][x] != 1) { // 아래쪽이 벽인지 판단
                y += 1;
            } else { // 둘다 벽이면 break
                break;
            }
        }

        // 미로 출력
        for (int[] i : board) {
            for (int j : i) {
                bw.write(j + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
