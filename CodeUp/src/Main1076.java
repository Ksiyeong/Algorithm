import java.util.Scanner;

public class Main1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        char a = 'a';

        do {
            System.out.print(a + " ");
            a += 1;
        } while (a <= input);
    }
}

