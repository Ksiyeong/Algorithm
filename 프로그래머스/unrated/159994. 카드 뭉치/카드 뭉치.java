class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int cards1Length = cards1.length;
        int index2 = 0;
        int cards2Length = cards2.length;

        for (String goalCard : goal) {
            if (cards1Length > index1 && goalCard.equals(cards1[index1])) {
                index1++;
                continue;
            } else if (cards2Length > index2 && goalCard.equals(cards2[index2])) {
                index2++;
                continue;
            }
            return "No";
        }
        return "Yes";
    }
}