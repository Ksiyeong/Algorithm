class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (Math.max(left % n, left / n) + 1);
            left += 1;
        }

        return answer;
    }
}