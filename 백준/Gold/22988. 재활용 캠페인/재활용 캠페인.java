import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        System.out.println(solution(n, x, arr));
    }

    private static int solution(int n, long x, long[] arr) {
        arr = filterAndSort(arr, x);

        int answer = n - arr.length;
        n = arr.length;

        int i = 0;
        int j = n - 1;
        while (i < j) {
            if ((arr[i] + arr[j]) * 2 >= x) {
                answer++;
                i++;
                j--;
                n -= 2;
            } else {
                i++;
            }
        }

        return answer + n / 3;
    }

    private static long[] filterAndSort(long[] arr, long x) {
        int count = 0;

        // x보다 작은 숫자가 몇 개 있는지 세기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                count++;
            }
        }

        // 새로운 배열을 생성하고 x보다 작은 숫자만 복사
        long[] newArray = new long[count];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                newArray[newIndex] = arr[i];
                newIndex++;
            }
        }

        // 새로운 배열을 정렬
        Arrays.sort(newArray);
        return newArray;
    }
}