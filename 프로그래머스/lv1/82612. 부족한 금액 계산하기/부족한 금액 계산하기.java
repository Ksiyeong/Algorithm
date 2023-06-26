class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer += i;
        }

        answer *= price;

        long total = answer - money;

        return total < 0 ? 0 : total;
    }
}