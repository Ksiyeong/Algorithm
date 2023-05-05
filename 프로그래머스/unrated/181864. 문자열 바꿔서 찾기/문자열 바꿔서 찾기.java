class Solution {
    public int solution(String myString, String pat) {
        return myString.contains(changeAB(pat))
                ? 1
                : 0;
    }

    private String changeAB(String myString) {
        String result = "";
        for (int i = 0; i < myString.length(); i++) {
            result += myString.charAt(i) == 'A'
                    ? 'B'
                    : 'A';
        }
        return result;
    }
}