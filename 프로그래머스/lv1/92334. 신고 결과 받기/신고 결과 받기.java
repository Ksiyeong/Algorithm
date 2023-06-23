import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class Solution {
public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new HashSet<>());
            indexMap.put(id_list[i], i);

        }


        for (int i = 0; i < report.length; i++) {
            String[] split = report[i].split(" ");
            map.get(split[1]).add(split[0]);
        }

        for (int i = 0; i < id_list.length; i++) {
            Set<String> strings = map.get(id_list[i]);
            if (strings.size() >= k) {
                for (String string : strings) {
                    answer[indexMap.get(string)]++;
                }
            }
        }


        return answer;
    }
}