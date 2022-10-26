public class Power {
    public static void main(String[] args) {
        long output = power(3, 40);
        System.out.println(output); // --> 19334827
    }

    public static long power(int base, int exponent) {
        // TODO:
        if (exponent == 1) return base;

        long result = power(base, exponent / 2);

        if (exponent % 2 == 1) {
            return result * result * base % 94906249;
        } else {
            return result * result % 94906249;
        }
    }
}
