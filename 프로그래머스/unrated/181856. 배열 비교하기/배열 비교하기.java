import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int temp1 = arr1.length;
        int temp2 = arr2.length;

        if (temp1 == temp2) {
            temp1 = Arrays.stream(arr1).sum();
            temp2 = Arrays.stream(arr2).sum();
        }

        if (temp1 > temp2) {
            return 1;
        } else if (temp1 < temp2) {
            return -1;
        }
        return 0;
    }
}