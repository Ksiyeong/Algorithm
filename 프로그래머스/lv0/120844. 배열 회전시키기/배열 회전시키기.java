import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        int distance = direction.equals("right") ? 1 : -1;
        Collections.rotate(list, distance);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}