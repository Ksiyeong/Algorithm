import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        String answer = "";
        String[] split = String.valueOf(n).split("");
        Arrays.sort(split, Comparator.reverseOrder());
        for (String s : split) {
            answer += s;
        }
        return Long.parseLong(answer);
    }
}