import java.util.Scanner;

public class Main1071 {
    public static void main(String[] args) {
        gogo(sc.nextInt());
    }

    static Scanner sc = new Scanner(System.in);

    static void gogo(int a) { // 재귀함수
        if (a != 0) {
            System.out.println(a);
            gogo(sc.nextInt());
        }

    }
}

