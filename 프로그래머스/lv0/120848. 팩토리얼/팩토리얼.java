class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > answer) {
            answer++;
            n /= answer;

        }
        return answer;
    }
}
