import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        String[] splitBefore = before.split("");
        String[] splitAfter = after.split("");

        Arrays.sort(splitBefore);
        Arrays.sort(splitAfter);

        return Arrays.compare(splitBefore, splitAfter) == 0 ? 1 : 0;
    }
}