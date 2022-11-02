import java.util.ArrayDeque;
import java.util.Deque;

public class RotatedArraySearch {
    public static void main(String[] args) {
        int output = rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 2);
        System.out.println(output); // --> 5

        output = rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 100);
        System.out.println(output); // --> -1

        output = rotatedArraySearch(new int[]{5, 6, 0, 1, 2, 3, 4}, 4);
        System.out.println(output);
    }

    public static int rotatedArraySearch(int[] rotated, int target) {
        // TODO:
        for (int i = 0; i < rotated.length; i++) {
            if (rotated[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int rotatedArraySearch2(int[] rotated, int target) {
        int left = 0;
        int right = rotated.length - 1;

        while (left <= right) {
            int middle = (right + left) / 2;

            if (rotated[middle] == target) {
                return middle;
            }

            if (rotated[left] < rotated[middle]) {
                // 왼쪽 절반이 정렬되어 있는 상태
                if (target < rotated[middle] && rotated[left] <= target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                // 오른쪽 절반이 정렬되어 있는 상태
                if (target <= rotated[right] && rotated[middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }

        return -1;
    }
}
