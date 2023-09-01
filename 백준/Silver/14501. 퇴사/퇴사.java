import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        schedule = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] split = bf.readLine().split(" ");
            schedule[i][0] = Integer.parseInt(split[0]);
            schedule[i][1] = Integer.parseInt(split[1]);
        }
        recursive(0, 0);
        System.out.println(MONEY);
    }

    static int n;
    static int[][] schedule;
    static int MONEY = -1;

    static private void recursive(int index, int money) {
        if (index == n) {
            MONEY = Math.max(MONEY, money);
            return;
        } else if (index < n) {
            recursive(index + schedule[index][0], money + schedule[index][1]);
            recursive(index + 1, money);
        }
    }
}