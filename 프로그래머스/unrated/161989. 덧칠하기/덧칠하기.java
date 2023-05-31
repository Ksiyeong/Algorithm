class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int nextSectionStart = 0;
        for (int i : section) {
            if (i >= nextSectionStart) {
                answer += 1;
                nextSectionStart = i + m;
            }
        }
        return answer;
    }
}