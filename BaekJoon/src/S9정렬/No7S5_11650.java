package S9정렬;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class No7S5_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        TreeMap<Integer, ArrayList<Integer>> treeMap = new TreeMap<>();
        String[] xy;
        int x;
        int y;
        ArrayList<Integer> yList;

        for (int i = 0; i < N; i++) {
            xy = br.readLine().split(" ");
            x = Integer.parseInt(xy[0]);
            y = Integer.parseInt(xy[1]);

            if (treeMap.containsKey(x)) {
                yList = treeMap.get(x);
                yList.add(y);
                treeMap.put(x, yList);
            } else {
                yList = new ArrayList<>();
                yList.add(y);
                treeMap.put(x, yList);
            }
        }

        for (int key : treeMap.keySet()) {
            if (treeMap.get(key).size() > 1) {
                Collections.sort(treeMap.get(key));
            }

            for (int value : treeMap.get(key)) {
                bw.write(String.format("%d %d\n", key, value));
            }
        }

        bw.flush();
    }
}
