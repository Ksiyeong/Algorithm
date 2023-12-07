import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        // 사용하기 쉽게 list에 담는다
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i : scoville) {
            q.offer(i);
        }

        // 오름차순 정렬된 기준으로 첫번째 음식이 K보다 맵지 않은 경우 반복한다
        while (q.peek() < K) {
            // 음식을 섞을 수 없는 경우
            if (q.size() < 2) {
                return -1;
            }

            // 음식을 섞을 수 있는 경우
            q.offer(q.poll() + q.poll() * 2);
            answer++;
        }

        return answer;
    }
}