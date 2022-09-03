import java.util.Scanner;

public class Main1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        while (!a.equals("q")) {
            System.out.println(a);
            a = sc.next();
        }
        System.out.println(a);
    }
}

