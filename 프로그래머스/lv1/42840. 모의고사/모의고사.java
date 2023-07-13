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
            if (answer == aQ.peek()) numbers[0]++;
            if (answer == bQ.peek()) numbers[1]++;
            if (answer == cQ.peek()) numbers[2]++;
            
            aQ.add(aQ.poll());
            bQ.add(bQ.poll());
            cQ.add(cQ.poll());
        }

        int max = 0;
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
}
