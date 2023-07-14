class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] lostArr = new int[n + 2];
        int[] reserveArr = new int[n + 1];

        for (int i : lost) {
            lostArr[i]++;
            answer--;
        }

        for (int i : reserve) {
            if (lostArr[i] != 0) {
                lostArr[i] = 0;
                answer++;
            } else {
                reserveArr[i]++;
            }
        }

        for (int i = 1; i < reserveArr.length; i++) {
            if (reserveArr[i] != 1) {
                continue;
            }

            if (lostArr[i - 1] == 1) {
                lostArr[i - 1] = 0;
                answer++;
            } else if (lostArr[i + 1] == 1) {
                lostArr[i + 1] = 0;
                answer++;
            }
        }

        return answer;
    }
}