import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int output = binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6}, 2);
        System.out.println(output); // --> 2

        output = binarySearch(new int[]{4, 5, 6, 9}, 100);
        System.out.println(output); // --> -1
    }

    public static int binarySearch(int[] arr, int target) {
        // TODO: sort사용 금지, Arrays.binarySearch 금지
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int index = (low + high) / 2;
            int indexNum = arr[index];

            if (indexNum == target) {
                return index;

            } else if (indexNum > target) {
                high = index - 1;

            } else {
                low = index + 1;

            }
        }

        return -1;
    }
}
