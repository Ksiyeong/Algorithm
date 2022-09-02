import java.util.Scanner;

public class Main1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a % 2 == 0 ? "even" : "odd");
        System.out.println(b % 2 == 0 ? "even" : "odd");
        System.out.println(c % 2 == 0 ? "even" : "odd");

    }
}

