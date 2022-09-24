package S8기본수학2;

import java.util.Scanner;

public class No1S5_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = Integer.parseInt(sc.nextLine());
        String[] nums = sc.nextLine().split(" ");

        for (String num : nums) {
            int inum = Integer.parseInt(num);
            result -= inum == 1 ? 1 : 0;

            for (int j = 2; j < inum; j++) {
                if (inum % j == 0) {
                    result--;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}