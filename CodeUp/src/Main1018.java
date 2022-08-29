import java.util.Scanner;

public class Main1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] result = input.split(":");
        String s1 = result[0];
        String s2 = result[1];
        System.out.printf("%s:%s", s1, s2);
    }
}