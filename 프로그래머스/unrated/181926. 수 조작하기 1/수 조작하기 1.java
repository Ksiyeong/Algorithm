import java.util.Arrays;

class Solution {
    public int solution(int n, String control) {
return n + Arrays.stream(control.split(""))
                .mapToInt(direction -> {
                    switch (direction) {
                        case "w":
                            return 1;
                        case "s":
                            return -1;
                        case "d":
                            return 10;
                        default:
                            return -10;
                    }
                })
                .sum();
    }
}