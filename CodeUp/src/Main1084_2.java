import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main1084_2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    bw.write(i+" "+j+" "+k+"\n");
                    count += 1;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }
}
