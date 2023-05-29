class Solution {
public int[] solution(String[] park, String[] routes) {
        int[] answer = findStartPoint(park);
        int parkLength = park.length;

        for (String route : routes) {
            String[] tmp = route.split(" ");
            int distance = Integer.parseInt(tmp[1]);
            boolean success = true;

            int row = answer[0];
            int col = answer[1];

            if (tmp[0].equals("E")) {
                for (int i = 1; i <= distance; i++) {
                    if (col + i >= park[row].length() || park[row].charAt(col + i) == 'X') {
                        success = false;
                        break;
                    }
                }
                if (success) {
                    answer[1] += distance;
                }
            } else if (tmp[0].equals("W")) {
                for (int i = 1; i <= distance; i++) {
                    if (col - i < 0 || park[row].charAt(col - i) == 'X') {
                        success = false;
                        break;
                    }
                }
                if (success) {
                    answer[1] -= distance;
                }
            } else if (tmp[0].equals("S")) {
                for (int i = 1; i <= distance; i++) {
                    if (row + i >= parkLength || park[row + i].charAt(col) == 'X') {
                        success = false;
                        break;
                    }
                }
                if (success) {
                    answer[0] += distance;
                }
            } else { // "N"
                for (int i = 1; i <= distance; i++) {
                    if (row - i < 0 || park[row - i].charAt(col) == 'X') {
                        success = false;
                        break;
                    }
                }
                if (success) {
                    answer[0] -= distance;
                }
            }
        }
        return answer;
    }

    private int[] findStartPoint(String[] park) {
        int[] answer = new int[2];
        int parkLength = park.length;

        for (int i = 0; i < parkLength; i++) {
            String row = park[i];
            int rowLength = row.length();
            for (int j = 0; j < rowLength; j++) {
                if (row.charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
}