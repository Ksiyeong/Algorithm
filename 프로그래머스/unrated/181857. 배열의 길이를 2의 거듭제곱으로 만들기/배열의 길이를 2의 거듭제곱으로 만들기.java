class Solution {
    public int[] solution(int[] arr) {
        int length = 1;
        while (arr.length > length) {
            length *= 2;
        }
        int[] answer = new int[length];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}