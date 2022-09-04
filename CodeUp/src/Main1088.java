import java.io.*;
import java.util.Scanner;

public class Main1088 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0) continue;
            bw.write(i + " ");
        }
        bw.flush();
    }
}

