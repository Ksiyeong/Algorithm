import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        return factorial(new BigInteger(String.valueOf(balls))).divide(factorial(new BigInteger(String.valueOf(share))).multiply(factorial(new BigInteger(String.valueOf(balls - share))))).intValue();
    }

    BigInteger factorial(BigInteger num) {
        return num.compareTo(BigInteger.ONE) <= 0 ? BigInteger.ONE : num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }
}