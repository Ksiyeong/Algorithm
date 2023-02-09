import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int solution(String A, String B) {
        int count = 0;

        String[] arrayA = A.split("");
        String[] arrayB = B.split("");

        Deque<String> qA = new ArrayDeque<>();
        for (String a : arrayA) {
            qA.add(a);
        }

        while (!qA.toString().equals(Arrays.toString(arrayB))) {
            if (count == arrayA.length) return -1;
            qA.addFirst(qA.removeLast());
            count += 1;
        }

        return count;
    }
}