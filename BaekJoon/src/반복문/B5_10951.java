package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class B5_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;

        while ((input = br.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(input);
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            bw.write(a + b + "\n");
        }
        bw.flush();
    }
}
