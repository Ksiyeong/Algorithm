import java.util.Arrays;
import java.util.Scanner;

public class MyStorage {
    static String[] products = new String[5];
    static int[] counts = new int[5];

    static void showMenu() { //todo 프로그램 기능 확인
        System.out.println(
                "------------------------------\n" +
                "[System] 해당 프로그램의 기능입니다.\n" +
                        "1. 물건 정보(제품명) 등록하기\n" +
                        "2. 물건 정보(제품명) 등록 취소하기\n" +
                        "3. 물건 넣기 (제품 입고)\n" +
                        "4. 물건 빼기 (제품 출고)\n" +
                        "5. 재고 조회\n" +
                        "6. 프로그램 종료\n" +
                        "------------------------------"
        );
    }

    static int selectMenu(Scanner sc) { //todo 프로그램 기능 선택
        System.out.print("[System] 원하는 기능의 번호를 입력하세요 : ");
        return Integer.parseInt(sc.nextLine());
    }

    static void prod_input(Scanner sc) { //todo 1. 물건 정보(제품명) 등록하기
        System.out.println("[System] 제품을 등록합니다.");

        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                System.out.print("[System] 제품 등록을 원하는 제품명을 입력하세요 : ");
                products[i] = sc.nextLine();
                System.out.println("[System] 등록이 완료 되었습니다.");
                prod_search();
                return;
            }
        }
        System.out.println("[System] 등록 가능한 공간이 없습니다.");
    }

    static void prod_remove(Scanner sc) { //todo 2. 물건 정보(제품명) 등록 취소하기
        for (String prod:products) {
            if (prod != null) {
                break;
            }
            System.out.println("[System] 등록 취소할 제품이 없습니다.");
            return;
        }
        System.out.print("[System] 제품 등록 취소를 원하는 제품명을 입력하세요 : ");
        String prod = sc.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(prod)) {
                products[i] = null;
                counts[i] = 0;
                System.out.println("[System] 제품 취소가 완료되었습니다.");
                return;
            }
        }
        System.out.println("[System] 제품 목록에 없는 제품입니다.");
    }

    static void prod_amount_add(Scanner sc) { //todo 3. 물건 넣기(제품 입고)
        for (String prod:products) {
            if (prod != null) {
                break;
            }
            System.out.println("[System] 먼저 제품 등록을 해주세요.");
            return;
        }

        System.out.println("[System] 물건의 수량을 추가합니다. (입고)");

        prod_search();

        System.out.print("[System] 수량을 추가할 제품명을 입력하세요 : ");
        String prod = sc.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(prod)) {
                System.out.print("[System] 추가할 수량을 입력해주세요 : ");
                int count = Integer.parseInt(sc.nextLine());
                counts[i] += count;
                System.out.println("[Clear] 정상적으로 제품의 수량 추가가 완료되었습니다.");
                prod_search();
                return;
            }
        }
        System.out.println("[System] 등록되지 않은 제품입니다.");
    }

    static void prod_amount_decrease(Scanner sc) { //todo 4. 물건 빼기(제품 출고)
        for (String prod:products) {
            if (prod != null) {
                break;
            }
            System.out.println("[System] 먼저 제품 등록을 해주세요.");
            return;
        }

        System.out.println("[System] 제품의 출고를 진행합니다.");

        prod_search();

        System.out.print("[System] 출고를 진행할 제품명을 입력하세요 : ");
        String prod = sc.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(prod)) {
                System.out.print("[System] 원하는 출고량을 입력하세요 : ");
                int count = Integer.parseInt(sc.nextLine());
                counts[i] -= count;
                System.out.println("[Clear] 출고가 완료되었습니다.");
                prod_search();
                return;
            }
        }
        System.out.println("[System] 등록되지 않은 제품입니다.");
    }

    static void prod_search() { //todo 5. 재고 조회
        System.out.println("[System] 현재 등록된 제품 및 수량 ▼");
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                System.out.println("> 등록 가능 : 0개");
            } else {
                System.out.printf("> %s : %d개\n", products[i], counts[i]);
            }
        }
    }

    // main() 메서드는 점장님의 이름을 인자(args)로 전달 받습니다.
    public static void main(String[] args) {
        // 해당 프로그램의 버전, 점장님의 이름, 프로그램의 기능을 출력합니다.
        System.out.println("[Item_Storage_V3]");
        System.out.println("------------------------------");
        System.out.println("[System] " + Arrays.toString(args) + " 점장님 어서오세요.");
        Scanner sc = new Scanner(System.in);

        boolean system = true;

        // 프로그래밍 요청사항 6번을 확인해 보세요.
        // 사용자가 특정 번호를 입력하기 전 까지 프로그램은 종료되지 않도록 합니다.

        while (system) {
            showMenu();
            switch (selectMenu(sc)) {
                case 1:
                    prod_input(sc);
                    break;
                case 2:
                    prod_remove(sc);
                    break;
                case 3:
                    prod_amount_add(sc);
                    break;
                case 4:
                    prod_amount_decrease(sc);
                    break;
                case 5:
                    prod_search();
                    break;
                case 6:
                    system = false;
                    System.out.println(
                            "[System] 프로그램을 종료합니다.\n" +
                                    "[System] 감사합니다."
                    );
                    break;
            }
        }
        // 사용자의 입력에 따라 프로그램의 기능들이 실행될 수 있도록 합니다.
        // switch() 를 사용하여 줍니다.

    }
}