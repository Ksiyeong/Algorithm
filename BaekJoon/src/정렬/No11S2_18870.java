package S9정렬;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No11S2_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int[] sortedArr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sortedArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int index = 0;
        for (int i : sortedArr) {
            if (hashMap.containsKey(i)) continue;
            hashMap.put(i, index);
            index += 1;
        }

        for (int i : arr) {
            bw.write(hashMap.get(i) + " ");
        }

        bw.flush();
    }
}
