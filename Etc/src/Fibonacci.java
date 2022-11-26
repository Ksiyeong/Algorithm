public class Fibonacci {
    public static void main(String[] args) {
        int output = fibonacci(0);
        System.out.println(output); // --> 0

        output = fibonacci(6);
        System.out.println(output); // --> 1

        output = fibonacci(5);
        System.out.println(output); // --> 5

        output = fibonacci(9);
        System.out.println(output); // --> 34
    }

    public static int fibonacci(int num) {
        // TODO:
        if (num == 0) return 0;
        if (num <= 2) return 1;

        int[] arr = new int[num + 1];
        arr[1] = arr[2] = 1;

        makefibo(arr, 3);

        return arr[num];
    }

    static int[] makefibo(int[] arr, int now) {
        arr[now] = arr[now - 1] + arr[now - 2];
        if (arr.length - 1 == now) return arr;
        return makefibo(arr, now + 1);
    }

}
