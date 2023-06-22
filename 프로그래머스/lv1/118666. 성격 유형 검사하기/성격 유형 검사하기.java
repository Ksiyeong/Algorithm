class Solution {
public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] points = new int[4];

        for (int i = 0; i < survey.length; i++) {
            switch (survey[i].charAt(0)) {
                case 'R':
                    points[0] -= choices[i] - 4;
                    break;
                case 'T':
                    points[0] += choices[i] - 4;
                    break;
                case 'C':
                    points[1] -= choices[i] - 4;
                    break;
                case 'F':
                    points[1] += choices[i] - 4;
                    break;
                case 'J':
                    points[2] -= choices[i] - 4;
                    break;
                case 'M':
                    points[2] += choices[i] - 4;
                    break;
                case 'A':
                    points[3] -= choices[i] - 4;
                    break;
                case 'N':
                    points[3] += choices[i] - 4;
                    break;
            }
        }

        answer += points[0] >= 0 ? "R" : "T";
        answer += points[1] >= 0 ? "C" : "F";
        answer += points[2] >= 0 ? "J" : "M";
        answer += points[3] >= 0 ? "A" : "N";
        return answer;
    }
}