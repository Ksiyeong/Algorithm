package S4일차원배열;

import java.util.Scanner;

public class No53B2_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int result = 0;
            int combo = 0;
            String[] oxArr = sc.nextLine().split("");
            for (String ox : oxArr) {
                combo = ox.equals("O") ? combo += 1 : 0;
                result += combo;
            }
            System.out.println(result);
        }
    }
}
