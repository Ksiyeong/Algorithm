import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        Map<String, Integer> map = new HashMap<>();

        String[] tuples = s.substring(2, s.length() - 2).split("},\\{");
        for (String tuple : tuples) {
            String[] nums = tuple.split(",");
            for (String key : nums) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        int[] answer = new int[tuples.length];
        for (String key : map.keySet()) {
            answer[tuples.length - map.get(key)] = Integer.parseInt(key);
        }

        return answer;
    }
}