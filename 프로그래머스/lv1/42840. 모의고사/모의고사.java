import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] answers) {
        int[] numbers = new int[3];

        Queue<Integer> aQ = new ArrayDeque<>(List.of(1, 2, 3, 4, 5));
        Queue<Integer> bQ = new ArrayDeque<>(List.of(2, 1, 2, 3, 2, 4, 2, 5));
        Queue<Integer> cQ = new ArrayDeque<>(List.of(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));

        for (int answer : answers) {
            if (answer == pollAndAdd(aQ)) numbers[0]++;
            if (answer == pollAndAdd(bQ)) numbers[1]++;
            if (answer == pollAndAdd(cQ)) numbers[2]++;
        }

        int max = Integer.MIN_VALUE;
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                answer.clear();
                answer.add(i + 1);
            } else if (numbers[i] == max) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    int pollAndAdd(Queue<Integer> queue) {
        int num = queue.poll();
        queue.add(num);
        return num;
    }
}