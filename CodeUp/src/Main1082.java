import java.util.Scanner;

public class Main1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();
        int a = Integer.parseInt(hex, 16);

        for (int i = 1; i < 16 ; i++) {
            System.out.printf("%s*%X=%X\n", hex, i, a * i);
        }
    }
}


