import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] pillars = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] num = br.readLine().split(" ");
            pillars[i][0] = Integer.parseInt(num[0]);
            pillars[i][1] = Integer.parseInt(num[1]);
        }

        System.out.println(solution(n, pillars));
    }

    static int solution(int n, int[][] pillars) {
        Arrays.sort(pillars, Comparator.comparingInt(pillar -> pillar[0]));
        int max = getMax(pillars);
        int answer = 0;

        // 정방향
        int[] prefixA = new int[]{pillars[0][0], pillars[0][1]};
        for (int i = 1; i < n; i++) {
            answer += (pillars[i][0] - prefixA[0]) * prefixA[1];
            prefixA[0] = pillars[i][0];
            prefixA[1] = Math.max(prefixA[1], pillars[i][1]);
            if (prefixA[1] == max) {
                break;
            }
        }

        // 역방향
        int[] prefixB = new int[]{pillars[n - 1][0], pillars[n - 1][1]};
        for (int i = n - 2; i >= 0; i--) {
            answer += (prefixB[0] - pillars[i][0]) * prefixB[1];
            prefixB[0] = pillars[i][0];
            prefixB[1] = Math.max(prefixB[1], pillars[i][1]);
            if (prefixB[1] == max) {
                break;
            }
        }

        // 중간
        answer += (prefixB[0] - prefixA[0] + 1) * max;

        return answer;
    }

    static int getMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            if (ints[1] > max) {
                max = ints[1];
            }
        }
        return max;
    }
}