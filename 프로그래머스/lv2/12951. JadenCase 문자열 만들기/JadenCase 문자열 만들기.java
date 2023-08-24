class Solution {
    public String solution(String s) {
        String answer = "";

        boolean space = true;
        for (String str : s.split("")) {
            answer += space ? str.toUpperCase() : str.toLowerCase();
            space = str.equals(" ") ? true : false;
        }

        return answer;
    }
}