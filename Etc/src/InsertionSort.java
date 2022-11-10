import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // 삽입 정렬
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }

        int[] arr2 = arr.clone();
        Arrays.sort(arr2);

        int[] output = insertionSort(arr);

        System.out.println(Arrays.toString(output));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr, arr2));

    }

    public static int[] insertionSort(int[] arr) {
        // TODO:
        int temp;

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j -= 1) {

                if (arr[j + 1] < arr[j]) {

                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                } else break; // 현재 비교할 수가 앞의 수보다 크다면 이미 이전 범위는 이미 정렬이 되었으므로 비교할 필요없음

            }
        }

        return arr;
    }

}