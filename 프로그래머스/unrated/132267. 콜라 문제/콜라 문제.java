class Solution {
    public int solution(int a, int b, int n) {
        if (a > n) {
            return 0;
        }
        int nextN = n / a * b;
        return nextN + solution(a, b, nextN + n % a);
    }
}