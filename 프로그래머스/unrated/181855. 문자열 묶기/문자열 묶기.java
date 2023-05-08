import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthMap = new HashMap<>();

        Arrays.stream(strArr).mapToInt(String::length)
                .forEach(length -> lengthMap.put(length, lengthMap.getOrDefault(length, 0) + 1));

        return lengthMap.values().stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
    }
}