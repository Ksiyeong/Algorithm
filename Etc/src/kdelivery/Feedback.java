package kdelivery;

public class Feedback {
    private String customerName;
    private String shopName;
    private String foodName;
    private int grade;

    /**
     * @Feedback() : 정보를 저장합니다
     */
    Feedback(String customerName, String shopName, String foodName, int grade) {
        this.customerName = customerName;
        this.shopName = shopName;
        this.foodName = foodName;
        this.grade = grade;
    }

    /**
     * @getStars() : 사용자가 입력한 점수가 별점으로 전환
     */
    String getStars() {
        String stars = "";
        for (int i = 0; i < this.grade; i++) {
            stars += "★";
        }
        return stars;
    }

    /**
     * @printInfo() : 출력
     */
    void printInfo() {
        System.out.printf(
                "-------------------------\n" +
                "%s [고객님]\n" +
                "주문 매장 : %s\n" +
                "주문 메뉴 : %s\n" +
                "별점 : %s\n",
                customerName, shopName, foodName, getStars()
        );
    }

}