public class CoinChange {
    public static void main(String[] args) {
        int total = 10;
        int[] coins = new int[]{1, 5};
        int output = coinChange(total, coins);
        System.out.println(output); // --> 3

        total = 4;
        coins = new int[]{1, 2, 3};
        output = coinChange(total, coins);
        System.out.println(output); // --> 4 ([1, 1, 1, 1], [1, 1, 2], [2, 2], [1, 3])
    }

    public static int coinChange(int total, int[] coins) {
        // TODO :
        int[][] arr = new int[coins.length + 1][total + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = arr[i - 1][j] +
                        (coins[i - 1] <= j ? arr[i][j - coins[i - 1]] : 0);
            }
        }


        return arr[coins.length][total];
    }

    // https://withhamit.tistory.com/333
}
