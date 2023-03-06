class Solution {
    public int solution(int a, int b) {
        int temp = 2;

        while (temp <= a && temp <= b) {
            if (a % temp == 0 && b % temp == 0) {
                a /= temp;
                b /= temp;
                temp = 2;
                continue;
            }
            temp++;
        }

        while (b != 1) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }
}