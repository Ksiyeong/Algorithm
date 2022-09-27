public class Greedy편의점알바 {
    public static void main(String[] args) {
        // 4000원을 받았을 때 500원짜리 동전 8개를 반환합니다.
        int output1 = partTimeJob(4000);
        System.out.println(output1); // --> 8

// 4972원을 받았을 때 500원짜리 동전 9개, 100원짜리 동전 4개, 50원짜리 동전 1개, 10원짜리 동전 2개, 1원짜리 동전 2개, 총 18개를 반환합니다.
        int output2 = partTimeJob(4972);
        System.out.println(output2); // --> 18
    }

    public static int partTimeJob(int k) {
        // TODO:
        int[] coins = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int coin : coins) {
            count += k / coin;
            k = k % coin;
        }

        return count;
    }
}
