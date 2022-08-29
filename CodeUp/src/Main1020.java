import java.util.Scanner;

public class Main1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] id = input.split("-");

        int i1 = Integer.parseInt(id[0]);
        int i2 = Integer.parseInt(id[1]);

        System.out.printf("%06d%d", i1, i2);
    }
}