import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {
        // 예측 기준 a = 2, b = 1
        Scanner sc = new Scanner(System.in);
        System.out.print("[인공지능 프로그램]\n" + "==============================\n" + "[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");
        int adCost = sc.nextInt();
        System.out.printf("[안내] 입력된 광고비는 %d 원 입니다.\n[안내] AI의 예측(클릭 수)은 %d회 입니다.", adCost, adCost * 2 + 1);
    }
}
