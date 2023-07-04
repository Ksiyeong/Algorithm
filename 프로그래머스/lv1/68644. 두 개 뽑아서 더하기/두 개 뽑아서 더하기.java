import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers) {
        return IntStream.range(0, numbers.length).flatMap(i -> IntStream.range(0, numbers.length).filter(j -> i != j).map(j -> numbers[i] + numbers[j])).distinct().sorted().toArray();
    }
}