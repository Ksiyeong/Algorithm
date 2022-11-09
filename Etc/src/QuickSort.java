import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] output = quickSort(new int[]{5,4,3,2,1});
        System.out.println(Arrays.toString(output));
    }

    public static int[] quickSort(int[] arr) {
        // TODO:

        if (arr.length <= 1) {
            return arr;
        }

        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                int temp = arr[1];
                arr[1] = arr[0];
                arr[0] = temp;
            }
            return arr;
        }

        // 피벗을  고른다
        int pivot = arr[arr.length - 1];

        int leftIndex = 0;
        int rightIndex = arr.length - 2;
        int temp;

        while (true) {

            // left와 right 인덱스 변동이 둘다 멈추면
            if (arr[leftIndex] >= pivot && arr[rightIndex] <= pivot) {

                // leftIndex가 rightIndex보다 크면 피벗의 위치와 left인덱스의 위치를 바꾼뒤 while문 종료
                if (leftIndex > rightIndex) {
                    arr[arr.length - 1] = arr[leftIndex];
                    arr[leftIndex] = pivot;
                    break;
                }

                // left와 right의 위치를 바꾼다
                temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
            } else if (arr[leftIndex] >= pivot) {
                if (leftIndex == rightIndex) {
                    arr[arr.length - 1] = arr[leftIndex];
                    arr[leftIndex] = pivot;
                    break;
                }
            }

            // left가 pivot보다 작거나 같으면 위치를 옮길 필요가 없으므로 인덱스 변경
            if (arr[leftIndex] <= pivot && leftIndex < arr.length - 1) {
                leftIndex += 1;
            }

            // right pivot보다 크거나 같으면 위치를 옮길 필요가 없으므로 인덱스 변경
            if (arr[rightIndex] >= pivot && rightIndex > 0) {
                rightIndex -= 1;
            }
        }

        // pivot의 최종 위치가 정해졌으므로 pivot을 기점으로 나누어 재귀로 정렬 후 모두 합쳐서 리턴해준다
        int[] leftArr = quickSort(Arrays.copyOfRange(arr, 0, leftIndex));
        System.arraycopy(leftArr, 0, arr, 0, leftArr.length);

        int[] rightArr = quickSort(Arrays.copyOfRange(arr, leftIndex + 1, arr.length));
        System.arraycopy(rightArr, 0, arr, leftIndex + 1, rightArr.length);

        return arr;
    }

    /** REFERENCE */
//    public int[] quickSort(int[] arr) {
//        //빈 배열일 경우
//        if (arr.length == 0) return arr;
//
//        int left = 0;
//        int right = arr.length - 1;
//
//        return sort(arr, left, right);
//    }
//
//    //퀵 정렬 메서드
//    private int[] sort(int[] arr, int left, int right) {
//        //partition 메서드를 활용하여 정렬
//        int part = partition(arr, left, right);
//        if (left < part - 1) arr = sort(arr, left, part - 1);
//        if (right > part) arr = sort(arr, part, right);
//
//        return arr;
//    }
//
//    private int partition(int[] arr, int left, int right) {
//        // 배열의 중앙을 기준으로
//        int pivot = arr[(left + right) / 2];
//        //좌측이 우측보다 작을 경우, 즉 아직 모든 배열을 순회하지 않은 경우 반복
//        while (left <= right) {
//            //좌측의 수가 기준점보다 작다면
//            while (arr[left] < pivot) left++;
//            //우측의 수가 기준점보다 크다면
//            while (arr[right] > pivot) right--;
//            if (left <= right) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
//            }
//        }
//        return left;
//    }
}
