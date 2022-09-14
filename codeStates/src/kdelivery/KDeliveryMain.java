package kdelivery;

import java.util.*;

// 클래스를 정의 합니다.
public class KDeliveryMain {
    /**
     * 음식점 등록 개수, 음식 주문 가능 횟수, 리뷰 등록 가능 횟수 정의
     */
    private static int SHOP_MAX = 5;
    private static int ORDER_MAX = 5;
    private static int FEEDBACK_MAX = ORDER_MAX;
    private static boolean open = true;


    /**
     * 배열을 담을 수 있는 객체 생성
     * 사용 범위, 객체 타입, 객체 이름
     */
    private Map<Shop, Map<String, Integer>> shops = new HashMap<Shop, Map<String, Integer>>();
    private Order[] orders;
    private List<Feedback> feedbacks = new ArrayList<>();

    // 해당 변수를 제어하는 Idx변수를 정의하고 초기화


    private Scanner sc = new Scanner(System.in); // 사용자의 입력을 받는 객체 생성

    /**
     * @KDeliveryMainV1() : 매장 정보, 주문 정보, 리뷰 정보 초기화
     * initValues() 메서드 사용
     * */


    /**
     * @initValues() : 객체에 저장될 수 있는 크기 지정
     * SHOP_MAX, ORDER_MAX, FEEDBACK_MAX = 5
     * */


    /**
     * @close() : 프로그램 종료를 위해 사용되는 메서드
     * 사용자가 종료를 선언하면 동작합니다.
     * main()에서 활용됩니다.
     * */
    void close() {
        System.out.println("[안내] 이용해주셔서 감사합니다.");
        open = false;
    }


    /**
     * selectMainMenu() : 기능을 나열하며, 사용자가 원하는 기능을 정수로 받습니다.
     */
    public void selectMainMenu() {
        System.out.println("[치킨의 민족 프로그램 V1\n" +
                "-------------------------\n" +
                "1) [사장님용] 음식점 등록하기\n" +
                "2) [고객님과 사장님용] 음식점 별점 조회하기\n" +
                "3) [고객님용] 음식 주문하기\n" +
                "4) [고객님용] 별점 등록하기\n" +
                "5) 프로그램 종료하기\n" +
                "-------------------------\n" +
                "[시스템] 무엇을 도와드릴까요?");

        int number = Integer.parseInt(sc.nextLine());
        switch (number) {
            case 1:
                selectAddShopMenu();
                break;
            case 2:
                selectDashboardMenu();
                break;
            case 3:
                selectOrderMenu();
                break;
            case 4:
                selectFeedbackMenu();
                break;
            case 5:
                close();
                break;
            default:
                System.out.println("[에러] 유효하지 않는 기능입니다.");
                selectMainMenu();
        }

    }

    /**
     * @selectAddShopMenu() : 음식점의 정보를 등록합니다.
     * @shops : 가게 정보를 저장합니다.
     * @shopIdx : 가게 정보의 인덱스
     */

    public void selectAddShopMenu() {

        /**
         * @Shop.java 의 Shop 클래스를 활용한 객체 생성
         * @public 클래스 : 동일 패키지 및 다른 패키지에서 사용가능
         * @addFood() : Shop.java 의 Shop 클래스의 addFood() 메서드
         * 해당 메서드는 매장명, 음식명, 가격을 입력받아 객체에 저장
         * 값이 저장될 때 마다 shopIdx 값 증가
         */
        System.out.println(
                "[안내] 반갑습니다. 가맹주님!\n" +
                "[안내] 음식점 상호는 무엇인가요?"
        );
        String shopName = sc.nextLine();
        Shop shop = new Shop(shopName);

        System.out.println("[안내] 대표 메뉴 이름은 무엇인가요?");
        String foodName = sc.nextLine();

        System.out.println("[안내] 해당 메뉴 가격은 얼마인가요?");
        int price = Integer.parseInt(sc.nextLine());

        shop.addFood(foodName, price);
        System.out.printf("[안내] %s에 음식(%s, %d)이 추가되었습니다\n", shopName, foodName, price);

        shops.put(shop, shop.foodInfo);
        System.out.println("[시스템] 가게 등록이 정상 처리되었습니다.\n");
    }

    /**
     * @selectDashboardMenu() : 해당 메서드는 등록된 가게 정보를 출력합니다.
     * Feedback.java 파일의 클래스 및 메서드를 활용합니다.
     */
    void selectDashboardMenu() {
        for (Feedback feedback : feedbacks) {
            feedback.printInfo();
        }
        System.out.println("");
    }

    /**
     * @selectOrderMenu() : 주문 기능
     * 사용자의 입력을 받아 orders 객체에 저장
     * */
    void selectOrderMenu() {
        System.out.println("[안내] 주문자 이름을 알려주세요!");
        String customerName = sc.nextLine();

        System.out.println("[안내] 주문할 음식점 상호는 무엇인가요?");
        String shopName = sc.nextLine();

        System.out.println("[안내] 주문할 메뉴 이름을 알려주세요!");
        String foodName = sc.nextLine();

        Order order = new Order(customerName, shopName, foodName);

        System.out.printf("[안내] %s님!\n[안내] %s매장에 %s주문이 완료되었습니다.\n\n", order.customerName, order.shopName, order.foodName);
    }

    /**
     * @selectFeedbackMenu() : 메뉴의 피드백을 입력받는 기능
     */
    void selectFeedbackMenu() {
        String customoerName;
        String shopName;
        String foodName;
        int grade;
        System.out.println(
                "[안내] 고객님! 별점 등록을 진행합니다.\n" +
                        "[안내] 주문자 이름은 무엇인가요?"
        );
        customoerName = sc.nextLine();

        System.out.println("[안내] 음식점 상호는 무엇인가요?");
        shopName = sc.nextLine();

        System.out.println("[안내] 주문하신 음식 이름은 무엇인가요?");
        foodName = sc.nextLine();

        System.out.println("[안내] 음식맛은 어떠셨나요? (1점 ~ 5점)");
        grade = Integer.parseInt(sc.nextLine());

        this.feedbacks.add(new Feedback(customoerName, shopName, foodName, grade));
        System.out.println("[안내] 리뷰 등록이 완료되었습니다.\n");
    }

    public static void main(String[] args) {
        KDeliveryMain kDeliveryMain = new KDeliveryMain();

        do {
            kDeliveryMain.selectMainMenu();
        } while (open);
    }
}