import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] blocks = new int[st.countTokens()];
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(blocks));
    }

    static int solution(int[] blocks) {
        int answer = 0;

        for (int i = 1; i < blocks.length - 1; i++) {
            int leftHighest = getMax(blocks, 0, i);
            int rightHighest = getMax(blocks, i + 1, blocks.length);

            int compare = Math.min(leftHighest, rightHighest);

            if (compare > blocks[i]) {
                answer += compare - blocks[i];
            }
        }

        return answer;
    }

    private static int getMax(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}