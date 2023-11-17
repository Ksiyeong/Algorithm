class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];

        int x = (int) (left % n);
        int y = (int) (left / n);
        for (int i = 0; i < answer.length; i++) {
            if (x >= n) {
                x = 0;
                y += 1;
            }
            answer[i] = Math.max(x, y) + 1;
            x += 1;
        }

        return answer;
    }
}