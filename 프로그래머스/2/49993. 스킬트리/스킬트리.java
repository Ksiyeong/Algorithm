class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;

        int[] skillArr = new int[26];
        char[] temp = skill.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            skillArr[temp[i] - 65] = i + 1;
        }

        for (String skillTree : skill_trees) {
            int point = 1;
            for (char c : skillTree.toCharArray()) {
                if (skillArr[c - 65] > point) {
                    answer -= 1;
                    break;
                } else if (skillArr[c - 65] == point) {
                    point += 1;
                }
            }
        }

        return answer;
    }
}