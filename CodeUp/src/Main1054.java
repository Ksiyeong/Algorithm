import java.util.Scanner;

public class Main1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int result = (i == 1 && j == 1) ? 1 : 0;
        System.out.println(result);
    }
}