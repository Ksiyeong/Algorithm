import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;
        for (int s = 0, e = people.length - 1; s < e; e--) {
            if (limit >= people[s] + people[e]) {
                s++;
                answer++;
            }
        }

        return people.length - answer;
    }
}