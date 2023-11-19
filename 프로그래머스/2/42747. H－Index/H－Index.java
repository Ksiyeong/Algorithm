import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        citations = Arrays.stream(citations).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] <= i) {
                return i;
            }
        }

        return citations.length;
    }
}