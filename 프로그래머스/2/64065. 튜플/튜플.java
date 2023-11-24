import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int[] solution(String s) {
        Map<String, Integer> map = new HashMap<>();

        // 숫자 추출
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String num = matcher.group();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 정답 추출
        int[] answer = new int[map.size()];
        for (String key : map.keySet()) {
            answer[answer.length - map.get(key)] = Integer.parseInt(key);
        }

        return answer;
    }
}