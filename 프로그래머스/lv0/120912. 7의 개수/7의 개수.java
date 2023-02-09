import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
int answer = 0;

        for (String str : Arrays.toString(array).split("")) {
            if (str.equals("7")) {
                answer += 1;
            }
        }
        
        return answer;
    }
}