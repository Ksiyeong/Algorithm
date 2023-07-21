import java.util.Arrays;

class Solution {

    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);

        // 소수 배열 생성, 소수는 false로 표기
        boolean[] primes = new boolean[nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] + 1];
        for (int i = 2; i < primes.length; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j < primes.length; j += i) {
                    primes[j] = true;
                }
            }
        }
        
        // 소수인지 검사
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (!primes[nums[i] + nums[j] + nums[k]]) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}