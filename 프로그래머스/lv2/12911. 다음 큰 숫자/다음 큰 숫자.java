class Solution {
    public int solution(int n) {
        int answer = n + 1;
        String target = Integer.toBinaryString(n).replace("0", "");
        while (!Integer.toBinaryString(answer).replace("0", "").equals(target)) {
            answer++;
        }
        return answer;
    }
}