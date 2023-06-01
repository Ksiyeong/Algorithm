import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        for (String target : targets) {
            for (int i = 0; i < target.length(); i++) {
                map.put(target.charAt(i), Integer.MAX_VALUE);
            }
        }

        for (Character character : map.keySet()) {
            for (String key : keymap) {
                int index = key.indexOf(character) + 1;
                if (index > 0) {
                    map.put(character, Math.min(map.get(character), index));
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                Integer temp = map.get(targets[i].charAt(j));
                if (temp == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += temp;
            }
        }

        return answer;
    }
}