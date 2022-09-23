import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2~9) : ");

        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        boolean isTrue = 2 <= dan && dan <= 9;
        System.out.println("\n" + dan + " 단 이 입력되었습니다.");
        if (isTrue) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d%n", dan, i, dan * i);
            }
        } else {
            System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.");
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
