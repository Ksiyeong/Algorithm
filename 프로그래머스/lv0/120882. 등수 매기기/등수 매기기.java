import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        double[] avgs = new double[score.length];
        int[] rank = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            avgs[i] = ((double) score[i][0] + (double) score[i][1]) / 2;
            rank[i] = 1;
        }

        for (double avg : avgs) {
            for (int i = 0; i < rank.length; i++) {
                if (avg > avgs[i]) rank[i]++;
            }
        }

        return rank;
    }
}