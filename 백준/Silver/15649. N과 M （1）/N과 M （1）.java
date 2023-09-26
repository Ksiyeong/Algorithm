import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        solution(0, new int[m], 0);
        br.close();
        bw.flush();
        bw.close();
    }

    static void solution(int num, int[] arr, int index) throws IOException {
        if (num == m) {
            bw.write(Arrays.toString(arr).replaceAll(",", "").substring(1, m * 2) + "\n");
        } else {
            for (int i = 1; i <= n; i++) {
                if (!isContain(arr, i, index)) {
                    arr[index] = i;
                    solution(num + 1, arr, index + 1);
                }
            }
        }
    }

    static boolean isContain(int[] arr, int i, int index) {
        for (int j = 0; j < index; j++) {
            if (arr[j] == i) {
                return true;
            }
        }
        return false;
    }
}
