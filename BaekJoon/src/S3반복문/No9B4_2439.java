package S3반복문;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No9B4_2439 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String s = "";
            for (int j = 1; j <= n - i; j++) {
                s += " ";
            }
            for (int j = 1; j <= i; j++) {
                s += "*";
            }
            bw.write(s + "\n");
        }


        bw.flush();
    }
}
