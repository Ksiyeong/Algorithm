import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int output = binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6}, 2);
        System.out.println(output); // --> 2

        output = binarySearch(new int[]{4, 5, 6, 9}, 100);
        System.out.println(output); // --> -1
    }

    public static int binarySearch(int[] arr, int target) {
        // TODO:
        // 중간지점을 검색
        if (arr[arr.length / 2] == target) {
            return arr.length / 2;
        } else if (arr[arr.length / 2] > target) {
            
        }


    }
}
