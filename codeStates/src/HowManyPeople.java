import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // V1
        System.out.println("[인공지능 프로그램 V1]");
        System.out.println("==============================");
        System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");
        int adCost = sc.nextInt();
        System.out.printf("[안내] 입력된 광고비는 %d 원 입니다.\n[안내] AI의 예측(클릭 수)은 %d회 입니다.\n\n", adCost, adCost * 2 + 1);

        // V2
        System.out.println("[인공지능 프로그램 V2]");
        System.out.println("==============================");
        System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");
        adCost = sc.nextInt();
        System.out.print("[System] a 값을 입력하여 주세요 : ");
        int a = sc.nextInt();
        System.out.print("[System] b 값을 입력하여 주세요 : ");
        int b = sc.nextInt();
        System.out.println("==============================");
        System.out.println("\n[안내] 입력된 '광고비'는 다음과 같습니다.");
    }
}
