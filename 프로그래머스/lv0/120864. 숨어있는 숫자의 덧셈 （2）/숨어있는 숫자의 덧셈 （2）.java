class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.replaceAll("[^0-9]", " ").split(" ");
        for (String s : split) {
            if (!s.trim().equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}