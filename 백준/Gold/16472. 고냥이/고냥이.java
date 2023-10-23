import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        System.out.println(solution(n, arr));
    }

    private static int solution(int n, char[] arr) {
        int[] alphabet = new int[26];
        int answer = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (alphabet[arr[j] - 'a'] == 0) { // 새로운 알파벳일 경우
                count += 1;
            }
            alphabet[arr[j] - 'a'] += 1;

            while (count > n && i < j) { // count가 n보다 클경우 줄어들때까지 i위치를 이동
                alphabet[arr[i] - 'a'] -= 1;
                if (alphabet[arr[i] - 'a'] == 0) { // 사용중인 알파벳 하나를 없앴을 경우
                    count -= 1;
                }
                i += 1;
            }

            answer = Math.max(answer, j - i + 1);
            j += 1;
        }

        return answer;
    }

    // 읽기
    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}