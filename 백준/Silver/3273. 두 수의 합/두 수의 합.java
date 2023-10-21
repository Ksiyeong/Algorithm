import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int n = read();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = read();
        }
        int x = read();

        System.out.println(solution(arr, x));
    }

    private static int solution(int[] arr, int x) {
        int answer = 0;

        arr = filterAndSort(arr, x);

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int add = arr[i] + arr[j];

            if (add == x) {
                answer++;
                i++;
                j--;
            } else if (add < x) {
                i++;
            } else {
                j--;
            }
        }
        return answer;
    }

    private static int[] filterAndSort(int[] arr, int x) {
        int count = 0;

        // x보다 작은 숫자가 몇 개 있는지 세기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                count++;
            }
        }

        // 새로운 배열을 생성하고 x보다 작은 숫자만 복사
        int[] newArray = new int[count];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                newArray[newIndex] = arr[i];
                newIndex++;
            }
        }

        // 새로운 배열을 정렬
        Arrays.sort(newArray);
        return newArray;
    }

    // 읽기
    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}