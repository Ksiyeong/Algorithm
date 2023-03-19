class Solution {
    public int solution(String s) {
        int answer = 0;

        String before = "";
        for (String str : s.split(" ")) {
            answer += str.equals("Z") ? -Integer.parseInt(before) : Integer.parseInt(str);
            before = str;
        }

        return answer;
    }
}