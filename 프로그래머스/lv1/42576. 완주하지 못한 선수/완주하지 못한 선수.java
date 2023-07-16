import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        for (String str : completion) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        for (String str : participant) {
            if (!map.containsKey(str)) {
                return str;
            } else {
                if (map.get(str) == 1) {
                    map.remove(str);
                } else {
                    map.put(str, map.get(str) - 1);
                }
            }
        }

        return answer;
    }
}