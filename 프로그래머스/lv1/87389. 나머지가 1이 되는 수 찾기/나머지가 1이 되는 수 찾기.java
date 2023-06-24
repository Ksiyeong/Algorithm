class Solution {
    public int solution(int n) {
        // 홀수일 경우
        if (n % 2 == 1) {
            return 2;
        }

        // 짝수일 경우
        for (int i = 3; i < n / 2; i += 2) {
            if (n % i == 1) {
                return i;
            }
        }
        
        return n - 1;
    }
}