import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();

        int i = 2;
        while (n >= i) {
            if (n % i == 0) {
                answer.add(i);
                n /= i;
            } else {
                i++;
            }
        }

        return answer.stream().distinct().mapToInt(num -> num).toArray();
    }
}