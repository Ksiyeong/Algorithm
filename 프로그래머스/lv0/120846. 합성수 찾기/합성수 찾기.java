class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            if (isCompositeNum(i)) {
                answer++;
            }
        }

        return answer;
    }

    boolean isCompositeNum(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}