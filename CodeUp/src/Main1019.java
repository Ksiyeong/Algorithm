import java.util.Scanner;

public class Main1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] date = input.split("\\.");

        int y = Integer.parseInt(date[0]);
        int h = Integer.parseInt(date[1]);
        int m = Integer.parseInt(date[2]);

        System.out.printf("%04d.%02d.%02d", y, h, m);
    }
}