class Solution {
    public int solution(int n) {
        int target = Integer.bitCount(n);
        while (Integer.bitCount(++n) != target) {
        }
        return n;
    }
}