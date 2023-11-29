import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Boolean> map = new HashMap<>();
        boolean[] lengthArr = new boolean[21];
        for (String phone : phone_book) {
            lengthArr[phone.length()] = true;
            map.put(phone, true);
        }

        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (lengthArr[i]) {
                    if (map.containsKey(phone.substring(0, i))) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
