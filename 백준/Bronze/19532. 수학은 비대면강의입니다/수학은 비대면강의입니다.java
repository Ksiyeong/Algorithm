import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] readLine = br.readLine().split(" ");

        int a = Integer.parseInt(readLine[0]);
        int b = Integer.parseInt(readLine[1]);
        int c = Integer.parseInt(readLine[2]);
        int d = Integer.parseInt(readLine[3]);
        int e = Integer.parseInt(readLine[4]);
        int f = Integer.parseInt(readLine[5]);

        int x = (b * f - e * c) / (b * d - a * e);
        int y = (a * f - d * c) / (a * e - d * b);

        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }
}