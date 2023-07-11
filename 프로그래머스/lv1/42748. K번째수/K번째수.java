import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];
            System.arraycopy(array, commands[i][0] - 1, arr, 0, arr.length);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }

        return answer;
    }
}
