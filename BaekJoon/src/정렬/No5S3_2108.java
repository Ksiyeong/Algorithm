package S9정렬;

import java.io.*;
import java.util.Arrays;
import java.util.TreeMap;

public class No5S3_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int avg = (int) Math.round(Arrays.stream(arr).average().getAsDouble()); // 평균
        int median = arr[N / 2]; // 중앙값
        int mode = getMode(arr); // 최빈값 (여러개일경우 두번째로 작은수)
        int range = arr[N - 1] - arr[0]; // 최댓값 - 최솟

        bf.write(avg + "\n");
        bf.write(median + "\n");
        bf.write(mode + "\n");
        bf.write(range + "\n");
        bf.flush();
    }

    static int getMode(int[] arr) {
        TreeMap<Integer, Integer> modeMap = new TreeMap<>();

        for (int num : arr) {
            if (modeMap.containsKey(num)) {
                modeMap.put(num, modeMap.get(num) + 1);
            } else {
                modeMap.put(num, 1);
            }
        }

        int mode = 0;
        int modeCount = 0;

        for (int i : modeMap.keySet()) {
            if (modeMap.get(i) > modeCount) {
                mode = i;
                modeCount = modeMap.get(i);
            }
        }

        int count = 0;

        for (int i : modeMap.keySet()) {
            if (modeMap.get(i) >= modeCount) {
                count += 1;
                if (count == 2) return i;
            }
        }

        return mode;
    }
}
