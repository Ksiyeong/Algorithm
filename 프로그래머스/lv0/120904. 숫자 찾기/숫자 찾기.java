import java.util.Arrays;

class Solution {
    public int solution(int num, int k) {
        int[] nums = Arrays.stream(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                return i + 1;
            }
        }

        return -1;
    }
}