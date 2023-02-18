import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        answer[0] = Arrays.stream(array).max().getAsInt();
        for (int i : array) {
            if (i == answer[0]) {
                break;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }
}