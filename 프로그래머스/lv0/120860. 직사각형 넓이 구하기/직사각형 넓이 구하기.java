class Solution {
    public int solution(int[][] dots) {
        int max = dots[0][0];
        int min = dots[0][0];
        for (int[] dot : dots) {
            if (dot[0] > max) {
                max = dot[0];
            } else if (dot[0] < min) {
                min = dot[0];
            }
        }
        int width = max - min;

        max = dots[0][1];
        min = dots[0][1];
        for (int[] dot : dots) {
            if (dot[1] > max) {
                max = dot[1];
            } else if (dot[1] < min) {
                min = dot[1];
            }
        }
        int height = max - min;

        return width * height;
    }
}