class Solution {
    public int solution(String str1, String str2) {
        float intersection = 0;
        float union = 0;

        int[][] multiset1 = toMultiset(str1);
        int[][] multiset2 = toMultiset(str2);
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                intersection += Math.min(multiset1[i][j], multiset2[i][j]);
                union += Math.max(multiset1[i][j], multiset2[i][j]);
            }
        }

        return union == 0
                ? 65536
                : (int) (intersection / union * 65536);
    }

    private int[][] toMultiset(String str) {
        int[][] multiset = new int[26][26];
        str = str.toUpperCase();

        for (int i = 0; i < str.length() - 1; i++) {
            char char1 = str.charAt(i);
            char char2 = str.charAt(i + 1);
            if (isAlphabet(char1) && isAlphabet(char2)) {
                multiset[char1 - 65][char2 - 65]++;
            }
        }

        return multiset;
    }

    private boolean isAlphabet(char character) {
        return 'A' <= character && character <= 'Z';
    }
}