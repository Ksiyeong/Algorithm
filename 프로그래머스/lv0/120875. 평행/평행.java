class Solution {
    public int solution(int[][] dots) {
        return getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3]) || getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3]) || getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2]) ? 1 : 0;
    }

    double getSlope(int[] a, int[] b) {
        return (double) (a[1] - b[1]) / (a[0] - b[0]);
    }
}