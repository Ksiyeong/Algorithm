package 반복문;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B5_2438 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        String s = "";

        for (int i = 0; i < n; i++) {
            s += "*";
            bw.write(s + "\n");
        }

        bw.flush();
    }
}
