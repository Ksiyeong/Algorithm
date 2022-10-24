package S2조건문;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class No7B4_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(a, b, c));
        int reward=0;

        switch (set.size()) {
            case 1:
                reward = 10000 + 1000 * a;
                break;
            case 2:
                if (a == b || a == c) {
                    reward = 1000 + 100 * a;
                } else {
                    reward = 1000 + 100 * b;
                }
                break;
            case 3:
                reward = set.last() * 100;
        }
        System.out.println(reward);
    }
}
