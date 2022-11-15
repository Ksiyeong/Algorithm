/**
 * 정수를 요소로 갖는 배열을 입력받아 다음의 조건을 만족하는 LSCS*를 리턴해야 합니다.
 *
 * LSCS: 주어진 배열의 연속된 부분 배열*의 합을 구한다고 할 때, 이 중 가장 큰 값(Largest Sum of Contiguous Subarray)
 * 연속된 부분 배열들: 배열 [1,2,3]의 연속 부분 배열은 [1], [1, 2], [1, 2, 3], [2], [2, 3], [3] 입니다.
 */
public class LSCS {
    public static void main(String[] args) {
        int output = lscs(new int[]{1, 2, 3});
        System.out.println(output); // --> 6

        output = lscs(new int[]{1, 2, 3, -4});
        System.out.println(output); // --> 6 ([1, 2, 3])

        output = lscs(new int[]{1, 2, 3, -4, 5});
        System.out.println(output); // --> 7 ([1, 2, 3, -4, 5])

        output = lscs(new int[]{10, -11, 11});
        System.out.println(output); // --> 11 ([11])
    }

    public static int lscs(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int partSum = 0;

            for (int j = i; j < arr.length; j++) {
                partSum += arr[j];
                if (max < partSum) max = partSum;

            }
        }

        return max;
    }
}

