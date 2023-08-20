class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[]{0, sequence.length - 1};

        int sum = 0;
        int end = 0;

        for (int start = 0; start < sequence.length; start++) {
            while (sum < k && end < sequence.length) {
                sum += sequence[end];
                end++;
            }
            if (sum == k && answer[1] - answer[0] > end - 1 - start) {
                answer[0] = start;
                answer[1] = end - 1;
            }
            sum -= sequence[start];
        }

        return answer;
    }
}