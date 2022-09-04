import java.util.Scanner;

public class Purification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("[시스템] 유튜브 계정의 아이디를 입력하세요 {Ex - admin} : ");
        String id = sc.nextLine();
        System.out.print("[시스템] 유튜브 계정의 비밀번호를 입력하세요 {Ex - 0000} : ");
        String password = sc.nextLine();

        System.out.printf("[안내] 안녕하세요 %s님.\n", id);
        System.out.println("[안내] 유튜브 영상의 자막을 생성해 주세요.");
        String superimposed = sc.nextLine().replaceAll("킹", "열").replaceAll("시발", "사랑").replaceAll("꺼저", "용기").replaceAll("미친", "희망");
        System.out.println("========================================");
        System.out.println("[알림] 프로그램의 금칙어 리스트입니다.");
        System.out.println("[킹, 시발, 꺼저, 미친]");
        System.out.println("========================================");
        System.out.println("[알림] 자막 순화 프로그램 결과입니다.");
        System.out.printf(">>> %s\n", superimposed);
        System.out.println("[안내] 프로그램을 종료합니다.");

    }
}
