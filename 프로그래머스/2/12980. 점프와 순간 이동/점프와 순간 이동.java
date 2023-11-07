import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;

        while (n > 1) {
            if (n % 2 == 1) { // 홀수일 때
                n -= 1;
                ans += 1;
            } else {
                n /= 2;
            }
        }

        return ans;
    }
}