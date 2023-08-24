class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (String stringNum : s.split(" ")) {
            int num = Integer.parseInt(stringNum);
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }

        return min + " " + max;
    }
}