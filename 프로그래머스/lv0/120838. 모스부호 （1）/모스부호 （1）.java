import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        HashMap<String, Character> morse = new HashMap<>();
        String[] secrets = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (int i = 0; i < 26; i++) {
            morse.put(secrets[i], (char) (i + 97));
        }
        for (String secret : letter.split(" ")) {
            answer += morse.get(secret);
        }
        return answer;
    }
}