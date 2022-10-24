package 재귀;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_24060 {
    static int[] A, tmp;
    static int count = 0;
    static int K;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        A = new int[N];
        tmp = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(A, 0, N - 1);
        bw.write(result + "\n");
        bw.flush();
    }

    static void mergeSort(int[] arr, int p, int r) {
        if (count > K) return;
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    static void merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) tmp[t++] = A[i++];
            else tmp[t++] = A[j++];
        }

        while (i <= q) tmp[t++] = A[i++];

        while (j <= r) tmp[t++] = A[j++];

        i = p;
        t = 0;

        while (i <= r) {
            count++;
            if (count == K) {
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }
}
