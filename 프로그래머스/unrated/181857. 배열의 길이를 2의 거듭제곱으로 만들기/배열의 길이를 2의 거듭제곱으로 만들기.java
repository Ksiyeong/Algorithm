class Solution {
    public int[] solution(int[] arr) {
                if (arr.length == 1) {
            return arr;
        }
        int length = 2;
        while (arr.length > length) {
            length *= 2;
        }
        int[] answer = new int[length];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}