import java.io.*;
import java.util.StringTokenizer;

public class Main1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer input = new StringTokenizer(br.readLine());

        double result = (double) Integer.parseInt(input.nextToken()) * Integer.parseInt(input.nextToken()) * Integer.parseInt(input.nextToken()) / 8388608;

        bw.write(String.format("%.2f MB\n",result));
        bw.flush();
    }
}

