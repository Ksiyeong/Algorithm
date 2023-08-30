import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] questions = new int[n][3];
        for (int i = 0; i < n; i++) {
            String[] readLine = br.readLine().split(" ");
            questions[i][0] = Integer.parseInt(readLine[0]);
            questions[i][1] = Integer.parseInt(readLine[1]);
            questions[i][2] = Integer.parseInt(readLine[2]);
        }

        int answer = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    if (b != c && a != c && a != b && isTrue(a, b, c, questions)) {
                        answer++;
                    }
                }
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }

    static boolean isTrue(int a, int b, int c, int[][] questions) {
        for (int[] question : questions) {
            int A = question[0] / 100;
            int B = question[0] / 10 % 10;
            int C = question[0] % 10;

            int strike = 0;
            int ball = 0;

            if (a == A) {
                strike++;
            } else if (a == B || a == C) {
                ball++;
            }

            if (b == B) {
                strike++;
            } else if (b == A || b == C) {
                ball++;
            }

            if (c == C) {
                strike++;
            } else if (c == A || c == B) {
                ball++;
            }

            if (question[1] != strike || question[2] != ball) {
                return false;
            }
        }
        return true;
    }

}