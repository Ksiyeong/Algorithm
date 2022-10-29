package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B5_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        String v = br.readLine();

        int result = (int) Arrays.stream(arr)
                .filter(i -> i.equals(v))
                .count();

        System.out.println(result);
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int N = Integer.parseInt(br.readLine());
//        String[] arr = br.readLine().split(" ");
//        String v = br.readLine();
//
//        int result = Collections.frequency(Arrays.asList(arr), v);
//
//        bw.write(result + "\n");
//        bw.flush();
//    }
}
