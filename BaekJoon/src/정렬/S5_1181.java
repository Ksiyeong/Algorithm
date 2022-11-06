package 정렬;

import java.io.*;
import java.util.TreeMap;
import java.util.TreeSet;

public class S5_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        TreeMap<Integer, TreeSet<String>> treeMap = new TreeMap<>();
        TreeSet<String> treeSet;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (treeMap.containsKey(str.length())) {
                treeSet = treeMap.get(str.length());
                treeSet.add(str);
                treeMap.put(str.length(), treeSet);
            } else {
                treeSet = new TreeSet<>();
                treeSet.add(str);
                treeMap.put(str.length(), treeSet);
            }
        }

        for (TreeSet ts : treeMap.values()) {
            for (Object s : ts) {
                bw.write(s + "\n");
            }
        }
        bw.flush();
    }
}
