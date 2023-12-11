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
        StringBuilder base = new StringBuilder();
        for (char c : msg.toCharArray()) {
            base.append(c);
            if (map.containsKey(base.toString())) {
                result.set(result.size() - 1, map.get(base.toString()));
            } else {
                map.put(base.toString(), ++index);

                base = new StringBuilder("" + c);
                result.add(map.get(base.toString()));
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