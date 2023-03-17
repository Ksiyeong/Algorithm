import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        return (Arrays.stream(dots).mapToInt(dot -> dot[0]).max().getAsInt() - Arrays.stream(dots).mapToInt(dot1 -> dot1[0]).min().getAsInt()) * (Arrays.stream(dots).mapToInt(dot2 -> dot2[1]).max().getAsInt() - Arrays.stream(dots).mapToInt(dot3 -> dot3[1]).min().getAsInt());
    }
}