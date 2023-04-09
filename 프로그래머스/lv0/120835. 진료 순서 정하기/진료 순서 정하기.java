import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 1; i <= emergency.length; i++) {
            int max = Arrays.stream(emergency).max().getAsInt();
            int index = getIndex(emergency, max);
            answer[index] = i;
            emergency[index] = 0;
        }

        return answer;
    }

    public int getIndex(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }
}