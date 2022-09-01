import java.util.Scanner;

public class Main1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int result = (i == 0 && j == 0) ? 1 : 0;
        System.out.println(result);
    }
}