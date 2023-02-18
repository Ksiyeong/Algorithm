class Solution {
    public String solution(String s) {
        String answer = "";
        for (char i = 97; i <= 122; i++) answer += s.length() - s.replaceAll(i + "", "").length() == 1 ? i : "";
        return answer;
    }
}