import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력처리
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        // 풀이시작
        int answer = 0;
        for (int i = 0; i + 1 < arr.length; i++) {
            if (gcd(arr[i], arr[i + 1]) != 1) {
                answer += check(arr[i], arr[i + 1]);
            }
        }
        System.out.println(answer);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int check(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            if (gcd(a, i) == 1 && gcd(i, b) == 1) {
                return 1;
            }
        }
        return 2;
    }
}
