class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] split = s.split("");

        int count = 0;
        for (String str : split) {
            if (count % 2 == 0) {
                answer.append(str.toUpperCase());
            } else {
                answer.append(str.toLowerCase());
            }
            if (str.equals(" ")) {
                count = 0;
            } else {
                count = count + 1;
            }
        }

        return answer.toString();
    }
}