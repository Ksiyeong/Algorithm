import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main1096 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        int[][] board = new int[19][19];
        for (int i = 0; i < n; i++) {
            board[sc.nextInt() - 1][sc.nextInt() - 1] = 1;
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
