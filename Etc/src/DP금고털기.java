public class DP금고털기 {
    public static void main(String[] args) {
        long output = ocean(50, new int[]{10, 20, 50});
        System.out.println(output); // 4

        output = ocean(100, new int[]{10, 20, 50});
        System.out.println(output); // 10

        output = ocean(30, new int[]{5, 6, 7});
        System.out.println(output); // 4
    }

    public static long ocean(int target, int[] type) {
        // TODO: 다이나믹 프로그래밍을 사용해보자
        // 동전 구하기 알고리즘
        // target=50 {10, 20, 50}
        //     0 10 20 30 40 50
        //  0  1  0  0  0  0  0
        // 10  1  1  1  1  1  1
        // 20  1  1  2  2  3  3
        // 50  1  1  2  2  3  4

        // 화폐단위만큼+1, target+1만큼 -> 0일 경우를 생성
        long[][] ways = new long[type.length + 1][target + 1];
            ways[0][0] = 1;

        for (int i = 1; i < ways.length; i++) {
            for (int j = 0; j < target + 1; j++) {
                if (j - type[i-1] >= 0) {
                    ways[i][j] = ways[i - 1][j] + ways[i][j - type[i-1]];
                } else {
                    ways[i][j] = ways[i - 1][j];
                }
            }
        }
        return ways[type.length][target];
    }

    public static long oceanNew(int target, int[] type) {
        // 기존 알고리즘에서 하나씩 쌓는 방법으로 변경
        long[] ways = new long[target + 1];
        ways[0] = 1;
        for (int i = 0; i < type.length; i++) {
            for (int j = 1; j <= target; j++)
                if (type[i] <= j)
                    ways[j] += ways[j - type[i]];
        }
        return ways[target];
    }
}