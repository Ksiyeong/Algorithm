import java.io.*;
import java.util.StringTokenizer;

public class Main1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer input = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(input.nextToken());
        int b = Integer.parseInt(input.nextToken());
        int c = Integer.parseInt(input.nextToken());
        int s = Integer.parseInt(input.nextToken());

        double result = (double) h * b * c * s /8388608;



        bw.write(String.format("%.1f MB\n",result));
        bw.flush();
    }
}

