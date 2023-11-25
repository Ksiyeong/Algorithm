import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Deque<Integer> q = new ArrayDeque<>();
        for (int priority : priorities) {
            q.offer(priority);
        }

        while (!q.isEmpty()) {
            Integer poll = q.poll();
            int max = q.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);

            if (poll >= max) {
                answer += 1;
                if (location == 0) {
                    return answer;
                }
            } else {
                q.offer(poll);
            }

            location -= 1;
            if (location < 0) {
                location = q.size() - 1;
            }
        }

        return answer;
    }
}