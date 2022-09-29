public class 조합_블랙잭 {
    public static void main(String[] args) {
        int output = boringBlackjack(new int[]{1, 2, 3, 4});
        System.out.println(output); // 1

        output = boringBlackjack(new int[]{2, 3, 4, 8, 13});
        System.out.println(output); // 3
    }

    static public int boringBlackjack(int[] cards) {
        // TODO: 중복 불가능
        int num;
        int count = 0;

        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    num = cards[i] + cards[j] + cards[k];
                    count += 1;
                    for (int l = 2; l < num; l++) {
                        if (num % l == 0) {
                            count -= 1;
                            break;
                        }
                    }

                }
            }
        }
        return count;
    }
}