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

        char[] arr = str.toUpperCase().toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            char c1 = arr[i];
            char c2 = arr[i + 1];
            if (Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {
                multiset[c1 - 65][c2 - 65]++;
            }
        }

        return multiset;
    }
}