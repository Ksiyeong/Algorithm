class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] split = my_string.replaceAll("[^0-9]", " ").split(" ");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
            if (!split[i].equals("")) {
                answer += Integer.parseInt(split[i]);
            }
        }

        return answer;
    }
}