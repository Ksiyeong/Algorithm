import java.util.Arrays;
import java.util.regex.Pattern;

class Solution {
    public int[] solution(String my_string) {
        return Arrays.stream(my_string.split("")).filter(str -> Pattern.matches("\\d", str)).mapToInt(Integer::parseInt).sorted().toArray();
    }
}