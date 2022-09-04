import java.util.Scanner;

public class Main1087 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int result = 1;
        for (int i = 2; result < a; i++) {
            result += i;
        }
        System.out.println(result);
    }
}

