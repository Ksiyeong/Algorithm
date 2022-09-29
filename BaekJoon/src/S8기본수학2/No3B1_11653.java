package S8기본수학2;

import java.util.Scanner;

public class No3B1_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int i = 2;

        while (input != 1) {
            if (input % i == 0) {
                input = input / i;
                System.out.println(i);
            } else {
                i += 1;
            }
        }
    }
}