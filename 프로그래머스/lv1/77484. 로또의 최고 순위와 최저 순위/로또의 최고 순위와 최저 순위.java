

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[]{7, 7};

        for (int lotto : lottos) {
            if (lotto == 0) {
                answer[0]--;
            } else {
                for (int win_num : win_nums) {
                    if (lotto == win_num) {
                        answer[0]--;
                        answer[1]--;
                        break;
                    }
                }
            }
        }

        if (answer[0] == 7) {
            answer[0] = 6;
        }
        if (answer[1] == 7) {
            answer[1] = 6;
        }

        return answer;
    }
}