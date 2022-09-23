import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        // 사용량 입력받기
        // 1. 전력량 요금 (원 미만 절삭)
        // 2. 기본 요금
        // 3. 부가가치세 (원 미만 사사오입)
        // 4. 전력산업기반기금 (원 미만 절삭)
        // 총 요금 = 1 + 2 + 3 + 4 (십원 미만 절삭)

        System.out.println("===== 주택용 전력(저압) 요금 계산기 =====");
        System.out.print("사용량을 입력해주세요. (단위:kWh) : ");

        Scanner input = new Scanner(System.in);

        float kWh = input.nextFloat();
        int elecTotal;
        
        if (kWh <= 100) {
            elecTotal = (int) (410 + 60.7 * kWh);
        } else if (kWh <= 200) {
            elecTotal = (int) (60.7 * 100 + 910 + 125.9 * (kWh-100));
        } else if (kWh <= 300) {
            elecTotal = (int) (60.7 * 100 + 125.9 * 100 + 1600 + 187.9 * (kWh-200));
        } else if (kWh <= 400) {
            elecTotal = (int) (60.7 * 100 + 125.9 * 100 + 187.9 * 100 + 3850 + 280.6 * (kWh-300));
        } else if (kWh <= 500) {
            elecTotal = (int) (60.7 * 100 + 125.9 * 100 + 187.9 * 100 + 280.6 * 100 + 7300 + 417.7 * (kWh-400));
        } else {
            elecTotal = (int) (60.7 * 100 + 125.9 * 100 + 187.9 * 100 + 280.6 * 100 + 417.7 * 100 + 12940 + 709.5 * (kWh-500));
        }

        float tax1 = (float) Math.round(elecTotal * 0.1);
        int tax2 = (int) (elecTotal * 0.0037);
        tax2 = tax2 * 10; // 절삭

        int total = (int) (elecTotal + tax1 + tax2)/10;
        total *= 10; // 절삭
        System.out.println("요금 : " + total + "원");
    }
}