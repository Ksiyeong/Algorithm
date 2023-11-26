class Solution {
    public int solution(int k, int[][] dungeons) {
        this.k = k;
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        sequence = new int[dungeons.length];
        permutation(0);
        return answer;
    }

    static int k;
    static int answer = 0;
    static int[][] dungeons;
    static boolean[] visited;
    static int[] sequence;

    public void permutation(int depth) {
        if (depth == dungeons.length) {
            int energy = k;
            int count = 0;
            for (int i : sequence) {
                if (energy >= dungeons[i][0]) {
                    energy -= dungeons[i][1];
                    count += 1;
                }
            }
            if (answer < count) {
                answer = count;
            }
            return;
        }

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sequence[depth] = i;
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }
}