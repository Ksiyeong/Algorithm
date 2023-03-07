class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        int[] range = new int[201];

        for (int[] line : lines) {
            line[0] += 100;
            line[1] += 100;
            for (int i = line[0]; i < line[1]; i++) {
                range[i]++;
            }
        }

        for (int i = 0; i < range.length; i++) {
            if (range[i] > 1) {
                answer++;
            }
        }

        return answer;
    }
}