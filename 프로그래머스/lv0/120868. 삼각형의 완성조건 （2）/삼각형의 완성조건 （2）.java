import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        int i = sides[0] + sides[1] - 1;
        while (i + sides[0] > sides[1]) {
            i--;
            answer++;
        }
        return answer;
    }
}