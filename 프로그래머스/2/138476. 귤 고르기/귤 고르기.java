import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] arr = map.values().stream()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        while (k > 0) {
            k -= arr[answer];
            answer += 1;
        }

        return answer;
    }
}