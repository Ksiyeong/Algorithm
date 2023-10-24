import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] nums = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, cards, nums);
    }

    private static void solution(int n, int[] cards, int[] nums) {
        Arrays.sort(cards);
        StringBuilder answer = new StringBuilder();

        for (int num : nums) {
            int s = 0;
            int e = n - 1;
            boolean isFind = false;

            while (s <= e) {
                int index = (s + e) / 2;

                if (num > cards[index]) { // up
                    s = index + 1;

                } else if (num < cards[index]) { // down
                    e = index - 1;

                } else { // answer
                    isFind = true;
                    break;
                }
            }

            answer.append(isFind ? "1 " : "0 ");
        }

        System.out.println(answer);
    }
}