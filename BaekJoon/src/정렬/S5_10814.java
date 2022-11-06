package 정렬;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;

public class S5_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        TreeMap<Integer, ArrayList<String>> treeMap = new TreeMap<>();

        String[] arr;
        int age;
        String name;

        ArrayList<String> arrayList;

        for (int i = 0; i < N; i++) {
            arr = br.readLine().split(" ");
            age = Integer.parseInt(arr[0]);
            name = arr[1];

            if (treeMap.containsKey(age)) {
                arrayList = treeMap.get(age);
                arrayList.add(name);
                treeMap.put(age, arrayList);
            } else {
                arrayList = new ArrayList<>();
                arrayList.add(name);
                treeMap.put(age, arrayList);
            }
        }

        for (int resultAge : treeMap.keySet()) {
            for (String resultName : treeMap.get(resultAge)) {
                bw.write(String.format("%d %s\n", resultAge, resultName));
            }
        }
        bw.flush();
    }
}
