import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;

        // 연속부분수열들의 합을 저장할 배열 생성 및 q 생성
        int total = 0;
        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < elements.length; i++) {
            q.offer(i);
            total += elements[i];
        }

        boolean[] nums = new boolean[total + 1];

        // 연속부분수열의 합의 갯수 계산
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (Integer j : q) {
                sum += elements[j];
                if (!nums[sum]) {
                    nums[sum] = true;
                    answer += 1;
                }
            }
            q.offer(q.poll());
        }

        return answer;
    }
}