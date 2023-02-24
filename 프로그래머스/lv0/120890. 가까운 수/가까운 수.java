import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        int distance = 100;

        for (int i : array) {
            int temp = Math.abs(n - i);
            if (temp < distance) {
                answer = i;
                distance = temp;
            }
        }

        return answer;
    }
}