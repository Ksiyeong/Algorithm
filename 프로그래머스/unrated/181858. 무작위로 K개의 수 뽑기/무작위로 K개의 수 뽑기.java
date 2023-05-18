import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] distinctArr = Arrays.stream(arr)
                .distinct()
                .toArray();
        int[] result = Arrays.copyOf(distinctArr, k);
        for (int i = distinctArr.length; i < result.length; i++) {
            result[i] = -1;
        }
        return result;
    }
}