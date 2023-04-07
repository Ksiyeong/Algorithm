class Solution {
public int solution(int balls, int share) {
        int[][] temp = new int[balls + 1][share + 1];

        for (int i = 0; i <= balls; i++) {
            for (int j = 0; j <= Math.min(i, share); j++) {
                if (j == 0 || j == i) {
                    temp[i][j] = 1;
                } else {
                    temp[i][j] = temp[i - 1][j - 1] + temp[i - 1][j];
                }
            }
        }
        return temp[balls][share];
    }
}