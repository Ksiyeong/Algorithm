class Solution {
    public String[] solution(String[] quiz) {
        for (int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            int result = temp[1].equals("+")
                    ? Integer.parseInt(temp[0]) + Integer.parseInt(temp[2])
                    : Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);

            quiz[i] = result == Integer.parseInt(temp[4])
                    ? "O"
                    : "X";
        }

        return quiz;
    }
}