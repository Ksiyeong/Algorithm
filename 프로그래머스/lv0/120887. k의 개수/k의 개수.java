class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);

        for (int l = i; l <= j; l++) {

            for (String str : String.valueOf(l).split("")) {
                if (str.equals(strK)) {
                    answer++;
                }
            }

        }

        return answer;
    }
}