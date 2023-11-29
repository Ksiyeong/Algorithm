import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<Integer, Set<String>> map = new HashMap<>();

        // 값 셋팅
        for (String phone : phone_book) {
            Set<String> set = map.getOrDefault(phone.length(), new HashSet<>());
            set.add(phone);
            map.put(phone.length(), set);
        }

        for (int key = 1; key <= 20; key++) {
            if (!map.containsKey(key)) {
                continue;
            }

            for (int i = key + 1; i <= 20; i++) {
                if (!map.containsKey(i)) {
                    continue;
                }

                for (String string : map.get(i)) {
                    if (map.get(key).add(string.substring(0, key))) {
                        map.get(key).remove(string.substring(0, key));
                    } else {
                        return false;
                    }

                }
            }
        }

        return true;
    }
}