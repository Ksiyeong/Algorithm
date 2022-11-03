package 일차원배열;

import java.util.HashSet;
import java.util.Scanner;

public class B2_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> arrSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            arrSet.add(sc.nextInt() % 42);
        }


        System.out.println(arrSet.size());
    }
}
