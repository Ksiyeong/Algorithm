import java.util.Scanner;

public class Main1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("\\.");

        System.out.printf("%s-%s-%s", input[2], input[1], input[0]);
    }
}