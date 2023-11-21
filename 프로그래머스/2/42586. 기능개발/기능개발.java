import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int completedJob = 0;
        int nowIndex = 0; // 중복 검사를 피하기 위한 작업 진행도 기록
        while (completedJob < progresses.length) {
            // 작업 진행
            for (int i = nowIndex; i < progresses.length; i++) {
                if (progresses[i] < 100) {
                    progresses[i] += speeds[i];
                }
            }

            // 완료 작업 확인
            int complete = 0;
            for (int i = nowIndex; i < progresses.length; i++) {
                if (progresses[i] >= 100) {
                    complete += 1;
                    nowIndex += 1;
                } else {
                    break;
                }
            }

            // 현재 완료된 작업이 있는 경우 정답에 추가
            if (complete > 0) {
                answer.add(complete);
                completedJob += complete;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}