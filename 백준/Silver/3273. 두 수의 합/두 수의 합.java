import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int n = read();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = read();
        }
        int x = read();
        arr = Arrays.stream(arr)
                .filter(a -> a < x)
                .sorted()
                .toArray();

        int answer = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x) {
                answer++;
                i++;
                j--;
            } else if (arr[i] + arr[j] < x) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(answer);
    }

    // 읽기
    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}