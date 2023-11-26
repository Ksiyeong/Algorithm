class Solution {
    static int answer = 0;
    static int[][] dungeons;
    static boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        permutation(k, 0);
        return answer;
    }

    public void permutation(int energy, int count) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= energy) {
                visited[i] = true;
                permutation(energy - dungeons[i][1], count + 1);
                visited[i] = false;
            }
        }
        if (answer < count) {
            answer = count;
        }
    }
}