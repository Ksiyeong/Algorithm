import static java.util.regex.Pattern.matches;

class Solution {
    public String solution(String polynomial) {
        int x = 0;
        int num = 0;
        for (String s : polynomial.split(" ")) {
            if (matches("\\d*x", s)) {
                String replace = s.replace("x", "");
                x += replace.length() == 0 ? 1 : Integer.parseInt(replace);
            } else if (matches("\\d*", s)) {
                num += Integer.valueOf(s);
            }
        }
        String answer = "";

        if (x == 1) {
            answer += "x";
        } else if (x > 1) {
            answer += x + "x";
        } else {
            return "" + num;
        }

        if (num != 0) {
            answer += " + " + num;
        }

        return answer;
    }
}