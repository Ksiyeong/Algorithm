import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] ranks = new int[numlist.length];
        int[] ranges = new int[numlist.length];

        Arrays.sort(numlist);
        for (int i = 0; i < numlist.length; i++) {
            ranges[i] = Math.abs(numlist[i] - n);
        }

        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (ranges[i] > ranges[j]) {
                    ranks[i]++;
                }
            }
        }

        for (int i = numlist.length - 1; i >= 0; i--) {
            if (answer[ranks[i]] == 0) {
                answer[ranks[i]] = numlist[i];
            } else {
                answer[ranks[i] + 1] = numlist[i];
            }
        }

        return answer;
    }
}