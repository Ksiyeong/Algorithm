class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for (int i = 0; i < discount.length; i++) {
            // 10일 전 물품 환불
            if (i - 10 >= 0) {
                calculate(want, number, discount[i - 10], 1);
            }

            // 현재 날짜 물품 구매
            calculate(want, number, discount[i], -1);

            // 모두 구매했는지 여부 확인
            if (isComplete(number)) {
                answer += 1;
            }
        }

        return answer;
    }

    public void calculate(String[] want, int[] number, String product, int count) {
        for (int i = 0; i < want.length; i++) {
            if (want[i].equals(product)) {
                number[i] += count;
                return;
            }
        }
    }

    public boolean isComplete(int[] number) {
        for (int i : number) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }

}