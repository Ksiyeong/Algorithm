import java.util.Arrays;

public class LargestProductOfThree
{
    public static void main(String[] args) {
        int output = largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }

    public static int largestProductOfThree(int[] arr) {
        /* TODO:
            정수를 요소로 갖는 배열을 입력받아 3개의 요소를 곱해 나올 수 있는 최대값을 리턴해야 합니다
            입력으로 주어진 배열은 중첩되지 않은 1차원 배열입니다
            배열의 요소는 음수와 0을 포함하는 정수입니다
            배열의 길이는 3 이상입니다 */

        // 음수가 포함될 수 도 있기 때문에 고려해야함
        // 0이 더 클 수 도 있음
        Arrays.sort(arr);

        int postiveCount = 0;
        int zero = 0;
        int negativeCount = 0;

        for (int num : arr) {
            if (num > 0) {
                postiveCount += 1;
            } else if (num == 0) {
                zero += 1;
            } else {
                negativeCount += 1;
            }
        }

        /**양수를 만들 수 있는 경우가 가장 크다
         * 양수만 곱한 경우
         * 양수 x 음수 x 음수*/

        return Math.max(arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3], arr[arr.length - 1] * arr[1] * arr[0]);
    }
}
