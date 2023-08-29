import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());

            boolean YES = true;
            for (int j = 2; j <= 1_000_000; j++) {
                if (num % j == 0) {
                    bw.write("NO\n");
                    YES = false;
                    break;
                }
            }

            if (YES) {
                bw.write("YES\n");
            }
        }

        bw.flush();
    }
}