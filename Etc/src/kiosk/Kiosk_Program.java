package kiosk;

import java.util.Scanner;

// Kiosk_Program 클래스를 정의 합니다.
public class Kiosk_Program {
    static int menu_1_cost = 1000;
    static int menu_2_cost = 1500;
    static int menu_3_cost = 1000;
    static int menu_4_cost = 2000;

    static void input_print() {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.\n" + "------------------------------");
    }

    static int count(Scanner sc) {
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");
        int number = sc.nextInt();

        if (number <= 0 || number > 4) {
            // [경고] 문구를 출력합니다.
            System.out.println("[경고]메뉴에 포함된 번호를 입력하여 주세요.\n");
            // 그리고 다시 본 함수가 동작하여 다시 메뉴의 번호를 입력하도록 합니다.
            count(sc);
        }

        if (1 == number) {
            number = menu_1_cost;
        } else if (2 == number) {
            number = menu_2_cost;
        } else if (3 == number) {
            number = menu_3_cost;
        } else {
            number = menu_4_cost;
        }
        return number;
    }

    static int cost(int number) {
        // 안내 문구를 출력합니다.
        //TODO:
        System.out.println(
                "------------------------------\n" +
                        "[안내]선택하신 메뉴의 수량을 입력하여 주세요.\n" +
                        "(※ 최대 주문 가능 수량 : 99)"
        );

        // 입력받은 수량을 변수에 저장합니다.
        //TODO:
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        // 조건에 따라 문구 출력, 재입력을 진행합니다.
        // 조건은 다음과 같습니다.
        // 0 이하 || 99 초과
        // 두 조건 중 하나라도 참인경우 경고 문구 출력과 함께 다시 수량을 입력받을 수 있도록 합니다.
        //TODO:

        if (0 >= count || count > 99) {
            System.out.printf("[경고]%d개는 입력하실 수 업습니다.\n", count);
            System.out.println("[경고]수량 선택 화면으로 돌아갑니다.");
            cost(number);
        }

        return count * number;
    }
    static void output_print(int result) {
        //TODO:
        System.out.printf("[안내]주문하신 메뉴의 총 금액은 %d원 입니다.\n", result);
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }
}