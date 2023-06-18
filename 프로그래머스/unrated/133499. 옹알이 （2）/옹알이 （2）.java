class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            String str = babbling[i]
                    .replace("aya", "1")
                    .replace("ye", "2")
                    .replace("woo", "3")
                    .replace("ma", "4");
            if (verifyPass(str)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean verifyPass(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('4' < c) {
                return false;
            }
            if (i < str.length() - 1 && c == str.charAt(i + 1)) {
                return false;
            }

        }
        return true;
    }
}