class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        String[] split = my_string.split("");
        String temp = split[num1];
        split[num1] = split[num2];
        split[num2] = temp;

        for (String str : split) {
            answer += str;
        }
        
        return answer;
    }
}