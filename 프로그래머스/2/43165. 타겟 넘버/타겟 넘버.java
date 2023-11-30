import java.util.LinkedList;
import java.util.Queue;

class Solution {
    class Node {
        int depth;
        int value;

        public Node(int depth, int value) {
            this.depth = depth;
            this.value = value;
        }
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0));
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.depth == numbers.length) {
                if (node.value == target) {
                    answer += 1;
                }
            } else {
                q.offer(new Node(node.depth + 1, node.value + numbers[node.depth]));
                q.offer(new Node(node.depth + 1, node.value - numbers[node.depth]));
            }
        }

        return answer;
    }
}