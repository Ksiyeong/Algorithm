class Solution {
    public int solution(int n, int k) {
        // 숫자 추출
        String[] numbers = Integer.toString(n, k).split("0+");

        // 소수갯수 계산
        int answer = 0;
        for (String number : numbers) {
            if (isPrime(Long.parseLong(number))) {
                answer += 1;
            }
        }

        return answer;
    }

    private boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= (long) Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}