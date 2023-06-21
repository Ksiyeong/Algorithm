import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public String solution(String X, String Y) {
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        while (!X.isEmpty()) {
            char temp = X.charAt(0);

            int xLength = X.length();
            int yLength = Y.length();

            X = X.replace("" +temp, "");
            Y = Y.replace("" +temp, "");

            for (int i = 0; i < Math.min(xLength - X.length(), yLength - Y.length()); i++) {
                priorityQueue.add(temp);
            }
        }

        if (priorityQueue.size() == 0) {
            return "-1";
        }
        
        if (priorityQueue.peek() == '0') {
            return "0";
        }
        
        StringBuilder answer = new StringBuilder(priorityQueue.size());
        while (!priorityQueue.isEmpty()) {
            answer.append(priorityQueue.poll());
        }
        return answer.toString();
    }

}