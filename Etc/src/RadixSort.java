import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] output = radixSort(new int[]{3, 1, 21});
        System.out.println(Arrays.toString(output)); // --> [1, 3, 21]


        output = radixSort(new int[]{44, 4, 95, 3, 3, 2, 65, 31, 5});
        System.out.println(Arrays.toString(output));
    }


    static public int[] radixSort(int[] arr) {
        // TODO:
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }

        for (int i = 1; i <= max; i *= 10) {
            arr = countingSort(arr, i);
        }
        return arr;
    }

    static public int[] countingSort(int[] arr, int numberOfDigits) {
        int[] countArr = new int[10]; // 각 자릿수 숫자의 수를 담을 배열
        for (int i = 0; i < arr.length; i++) { // 각 자릿수를 추출하여 갯수를 담아준다
            countArr[arr[i] / numberOfDigits % 10] += 1;
        }

        for (int i = 1; i < 10; i++) { // 각 자릿수의 갯수의 누적합
            countArr[i] += countArr[i - 1];
        }

        int[] result = new int[arr.length]; // 결과를 담을 배열

        // 정렬 시작
        for (int i = arr.length - 1; i >= 0; i--) {
            int nOD = arr[i] / numberOfDigits % 10; // 해당 수의 현재 자릿수 추출
            result[--countArr[nOD]] = arr[i];
        }

        return result;
    }
}
