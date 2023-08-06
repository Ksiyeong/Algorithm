class Solution {
    public long solution(long r1, long r2) {
        long answer = 0;

        for (long x = 1; x <= r2; x++) {
            long minY = (long) Math.ceil(Math.sqrt(r1 * r1 - x * x));
            long maxY = (long) Math.sqrt(r2 * r2 - x * x);
            answer += maxY - minY + 1L;
        }

        return answer * 4;
    }
}