import java.util.List;
class Solution {
    public int solution(int n) {
                if (List.of(0, 1, 4, 5, 6, 9).contains(n % 10)) {
            for (int i = 0; i < n; i++) {
                if (i * i == n) {
                    return 1;
                }
                if (i * i > n) {
                    break;
                }
            }
        }
        return 2;
    }
}