class Solution {
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);

        return answer;
    }

    static int[] numbers;
    static int target;
    static int answer = 0;

    public void dfs(int depth, int num) {
        if (depth == numbers.length) {
            if (num == target) {
                answer += 1;
            }
            return;
        }

        dfs(depth + 1, num + numbers[depth]);
        dfs(depth + 1, num - numbers[depth]);
    }
}