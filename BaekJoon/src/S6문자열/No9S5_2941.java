package S6문자열;

import java.util.Scanner;

public class No9S5_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : croatia) {
            string = string.replace(s, "1");
        }

        System.out.println(string.length());
    }
}
