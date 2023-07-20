import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int i = 0;
        while (i < d.length && budget >= d[i]) {
            budget -= d[i];
            i++;
        }
        return i;
    }
}