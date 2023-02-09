class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int a = total / num;

        int b = num / 2;

        int c = a - b;

        for (int i = 0; i < num; i++) {
            if (num % 2 == 0) {
                answer[i] = c + i + 1;
            } else {
                answer[i] = c + i;
            }
        }

        return answer;
    }
}