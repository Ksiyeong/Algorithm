package 기본수학1;

import java.util.Scanner;

public class S4_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        int count = 0;
        while (kg > 0) {
            if (kg % 5 == 0) {
                count += kg / 5;
                break;
            }
            kg -= 3;
            count++;
        }

        System.out.println(kg < 0 ? -1 : count);
    }
}