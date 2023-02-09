import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<>();

        String temp = "";
        for (String str : my_str.split("")) {
            temp += str;
            if (temp.length() == n) {
                answer.add(temp);
                temp = "";
            }
        }

        if (temp.length() != 0) {
            answer.add(temp);
        }

        return answer.toArray(new String[answer.size()]);
    }
}