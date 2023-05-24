
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> stk = new ArrayList<>();
        while (i < arr.length) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
            } else {
                if (arr[i] == stk.get(stk.size() - 1)) {
                    stk.remove(stk.size() - 1);
                } else {
                    stk.add(arr[i]);
                }
            }
            i++;
        }
        if (stk.size() == 0) {
            return new int[]{-1};
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}