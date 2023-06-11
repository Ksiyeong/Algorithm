import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> top = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                top.add(score[i]);
                answer.add(top.stream().min(Integer::compareTo).get());
            } else {
                top.sort(Integer::compareTo);
                top.set(0, Math.max(top.get(0), score[i]));
                answer.add(top.stream().min(Integer::compareTo).get());
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}