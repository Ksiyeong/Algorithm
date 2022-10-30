package 일차원배열;

import java.io.*;
import java.util.ArrayList;

public class B5_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            result.add(i);
        }

        ArrayList<Integer> studentsNumber = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            studentsNumber.add(Integer.parseInt(br.readLine()));
        }

        result.removeAll(studentsNumber);
        bw.write(result.remove(0) + "\n" + result.remove(0));
        bw.flush();
    }
}
