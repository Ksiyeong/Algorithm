import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()) / 2;
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrA[i] = Integer.parseInt(st.nextToken());
            arrB[i] = Integer.parseInt(st.nextToken());
            br.readLine();
        }
        System.out.println(Math.max(solution(arrA, n), solution(arrB, n)));
        br.close();
    }

    static int solution(int[] arr, int n) {
        // 보정
        int temp = min(arr);
        if (temp != 0) {
            for (int i = 0; i < n; i++) {
                arr[i] -= temp;
            }
        }

        // 계산
        int[] result = new int[max(arr) + 1];
        for (int i = 0; i < n - 1; i++) {
            result[Math.min(arr[i], arr[i + 1])] += 1;
            result[Math.max(arr[i], arr[i + 1])] -= 1;
        }
        // 계산 - 맨처음 요소와 맨마지막 요소 추가 계산
        result[Math.min(arr[0], arr[n - 1])] += 1;
        result[Math.max(arr[0], arr[n - 1])] -= 1;

        // 누적합 계산
        for (int i = 1; i < result.length - 1; i++) {
            result[i] += result[i - 1];
        }

        return max(result);
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}
