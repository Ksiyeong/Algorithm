import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        // 이름과 그리움점수 맵에 담아서
        Map<String, Integer> yearningMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }

        // 사진별로 돌면서 정답배열에 합산
        for (int i = 0; i < photo.length; i++) {
            final int index = i;
            for (int j = 0; j < photo[i].length; j++) {
                Optional.ofNullable(yearningMap.get(photo[i][j])).ifPresent(score -> answer[index] += score);
            }
        }

        return answer;
    }
}