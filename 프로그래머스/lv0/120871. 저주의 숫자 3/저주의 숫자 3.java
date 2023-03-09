class Solution {
    int[] arr = new int[101];

    public int solution(int n) {
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[i - 1] + 1;
            }
            if (arr[i] % 3 == 0 || String.valueOf(arr[i]).contains("3")) {
                arr[i]++;
                i--;
            }
        }
        return arr[n];
    }
}