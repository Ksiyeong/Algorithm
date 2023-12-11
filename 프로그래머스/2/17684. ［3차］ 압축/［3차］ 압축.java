import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String msg) {
        // 기본 맵 생성
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            map.put(String.valueOf((char) (i + 64)), i);
        }

        // 풀이 시작
        List<Integer> result = new ArrayList<>();
        result.add(0);
        int index = 26;
        String base = "";
        for (char c : msg.toCharArray()) {
            base += c;
            if (map.containsKey(base)) {
                result.set(result.size() - 1, map.get(base));
            } else {
                map.put(base, ++index);

                base = "" + c;
                result.add(map.get(base));
            }
        }

        // 정답 반환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}