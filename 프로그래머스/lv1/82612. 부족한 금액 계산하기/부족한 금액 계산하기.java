class Solution {
    public long solution(long price, long money, long count) {
        return Math.max((1 + count) * count / 2 * price - money, 0);
    }
}