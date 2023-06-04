class Solution {
    public String solution(String s, String skip, int index) {
        char[] sArr = s.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            for (int j = 0; j < index; j++) {
                sArr[i] += sArr[i] >= 122 ? -25 : 1;
                if (skip.contains(sArr[i] + "")) {
                    j -= 1;
                }
            }
        }
        return String.valueOf(sArr);
    }
}