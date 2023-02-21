class Solution {
    public String solution(String my_string) {
        char[] answer = my_string.toCharArray();

        for (int i = 0; i < answer.length; i++) {
            answer[i] += answer[i] > 90 ? -32 : 32;
        }

        return String.valueOf(answer);
    }
}