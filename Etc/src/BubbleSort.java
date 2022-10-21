import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] output = bubbleSort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        int[] output = bubbleSort(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(output)); // --> [1, 2, 3]
    }

    public static int[] bubbleSort(int[] arr) {
        // TODO:
        int tmp;
        int[] tmpArr = arr.clone();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
            if (Arrays.equals(arr, tmpArr)) return arr;
            else tmpArr = arr.clone();
        }
        return arr;
    }
}
