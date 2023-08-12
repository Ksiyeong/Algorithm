class Solution {
    public String solution(String s) {
        String[] split = s.split("");
        StringBuilder answer = new StringBuilder();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count % 2 == 0) {
                answer.append(split[i].toUpperCase());
            } else {
                answer.append(split[i].toLowerCase());
            }
            count++;
            if (split[i].equals(" ")) {
                count = 0;
            }
        }

        return answer.toString();
    }
}